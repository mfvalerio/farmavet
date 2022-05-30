const PROXY_CONFIG = [
{
  context: ['/farmavet'],
  target: 'https://farmavet.herokuapp.com/',
  secure: false,
  loglevel: 'debug'
}
];

module.exports = PROXY_CONFIG;
