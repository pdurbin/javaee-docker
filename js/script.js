// inspired by https://gist.github.com/richard-flosi/b6cdba782576447fcc9789f6cdfe2e31
class TheMessage extends HTMLElement {
  constructor() {
    super();
    this.attachShadow({ mode: 'open' });
  }
  static get observedAttributes() {
    return ['loading', 'jsonData'];
  }
  get loading() {
    return JSON.parse(this.getAttribute('loading'));
  }
  set loading(v) {
    this.setAttribute('loading', JSON.stringify(v));
  }
  get jsonData() {
    return JSON.parse(this.getAttribute('jsonData'));
  }
  set jsonData(v) {
    this.setAttribute('jsonData', JSON.stringify(v));
  }
  async fetchJsonData(url) {
    this.loading = true;
    const response = await fetch(url);
    const json = await response.json();
    this.jsonData = json;
    this.loading = false;
  }
  async connectedCallback() {
    await this.fetchJsonData('http://localhost:9080/micro/resources/message');
  }
  attributeChangedCallback(attrName, oldVal, newVal) {
    this.render();
  }
  render() {
    if (this.loading) {
      this.shadowRoot.innerHTML = `Loading...`;
    } else {
      this.shadowRoot.innerHTML = this.jsonData.installations.length + " installations";
    }
  }
}
customElements.define('the-message', TheMessage);
