/*! jquery.cookie v1.4.1 | MIT */
// !function(a){"function"==typeof define&&define.amd?define(["jquery"],a):"object"==typeof exports?a(require("jquery")):a(jQuery)}(function(a){function b(a){return h.raw?a:encodeURIComponent(a)}function c(a){return h.raw?a:decodeURIComponent(a)}function d(a){return b(h.json?JSON.stringify(a):String(a))}function e(a){0===a.indexOf('"')&&(a=a.slice(1,-1).replace(/\\"/g,'"').replace(/\\\\/g,"\\"));try{return a=decodeURIComponent(a.replace(g," ")),h.json?JSON.parse(a):a}catch(b){}}function f(b,c){var d=h.raw?b:e(b);return a.isFunction(c)?c(d):d}var g=/\+/g,h=a.cookie=function(e,g,i){if(void 0!==g&&!a.isFunction(g)){if(i=a.extend({},h.defaults,i),"number"==typeof i.expires){var j=i.expires,k=i.expires=new Date;k.setTime(+k+864e5*j)}return document.cookie=[b(e),"=",d(g),i.expires?"; expires="+i.expires.toUTCString():"",i.path?"; path="+i.path:"",i.domain?"; domain="+i.domain:"",i.secure?"; secure":""].join("")}for(var l=e?void 0:{},m=document.cookie?document.cookie.split("; "):[],n=0,o=m.length;o>n;n++){var p=m[n].split("="),q=c(p.shift()),r=p.join("=");if(e&&e===q){l=f(r,g);break}e||void 0===(r=f(r))||(l[q]=r)}return l};h.defaults={},a.removeCookie=function(b,c){return void 0===a.cookie(b)?!1:(a.cookie(b,"",a.extend({},c,{expires:-1})),!a.cookie(b))}});

layui.define(["jquery"], function (exports) {
  var jQuery = layui.jquery;
  (function ($) {
    /*!
    * jQuery Cookie Plugin v1.4.1
    * https://github.com/carhartl/jquery-cookie
    *
    * Copyright 2013 Klaus Hartl
    * Released under the MIT license
    */
    (function (factory) {
      if (typeof define === 'function' && define.amd) {
        // AMD
        define(['jquery'], factory);
      } else if (typeof exports === 'object') {
        // CommonJS
        factory(require('jquery'));
      } else {
        // Browser globals
        factory(jQuery);
      }
    }(function ($) {
      var pluses = /\+/g;

      function encode(s) {
        return config.raw ? s : encodeURIComponent(s);
      }

      function decode(s) {
        return config.raw ? s : decodeURIComponent(s);
      }

      function stringifyCookieValue(value) {
        return encode(config.json ? JSON.stringify(value) : String(value));
      }

      function parseCookieValue(s) {
        if (s.indexOf('"') === 0) {
          // This is a quoted cookie as according to RFC2068, unescape...
          s = s.slice(1, -1).replace(/\\"/g, '"').replace(/\\\\/g, '\\');
        }

        try {
          // Replace server-side written pluses with spaces.
          // If we can't decode the cookie, ignore it, it's unusable.
          // If we can't parse the cookie, ignore it, it's unusable.
          s = decodeURIComponent(s.replace(pluses, ' '));
          return config.json ? JSON.parse(s) : s;
        } catch (e) { }
      }

      function read(s, converter) {
        var value = config.raw ? s : parseCookieValue(s);
        return $.isFunction(converter) ? converter(value) : value;
      }

      var config = $.cookie = function (key, value, options) {
        // Write

        if (value !== undefined && !$.isFunction(value)) {
          options = $.extend({}, config.defaults, options);

          if (typeof options.expires === 'number') {
            var days = options.expires, t = options.expires = new Date();
            t.setTime(+t + days * 864e+5);
          }

          return (document.cookie = [
            encode(key), '=', stringifyCookieValue(value),
            options.expires ? '; expires=' + options.expires.toUTCString() : '', // use expires attribute, max-age is not supported by IE
            options.path ? '; path=' + options.path : '',
            options.domain ? '; domain=' + options.domain : '',
            options.secure ? '; secure' : ''
          ].join(''));
        }

        // Read

        var result = key ? undefined : {};

        // To prevent the for loop in the first place assign an empty array
        // in case there are no cookies at all. Also prevents odd result when
        // calling $.cookie().
        var cookies = document.cookie ? document.cookie.split('; ') : [];

        for (var i = 0, l = cookies.length; i < l; i++) {
          var parts = cookies[i].split('=');
          var name = decode(parts.shift());
          var cookie = parts.join('=');

          if (key && key === name) {
            // If second argument (value) is a function it's a converter...
            result = read(cookie, value);
            break;
          }

          // Prevent storing a cookie that we couldn't decode.
          if (!key && (cookie = read(cookie)) !== undefined) {
            result[name] = cookie;
          }
        }

        return result;
      };

      config.defaults = {};

      $.removeCookie = function (key, options) {
        if ($.cookie(key) === undefined) {
          return false;
        }

        // Must not alter options, thus extending a fresh object...
        $.cookie(key, '', $.extend({}, options, { expires: -1 }));
        return !$.cookie(key);
      };

    }));

  })(jQuery);
  exports('cookie', null);
});