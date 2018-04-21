; (function () { 
    var htm = [
'<div class="kill-ie-mask"></div>',
'    <div class="kill-ie">',
'        <p class="bs-tit">温馨提示，当前浏览器IE内核版本太低，请升级您的浏览器至最新版本！</p>',
'        <div class="bs-desc">当前浏览器IE内核版本太低，继续使用有安全隐患、浏览不流畅、页面排版错误等问题，不再适合现代网站的丰富内容，本站建议您升级到一下浏览器。</div>',
'        <h2>请选择一款浏览器</h2>',
'        <ul>',
'            <li><a href="http://www.firefox.com.cn/download/" target="_blank"><img src="//static.21cnjy.com/kill-ie/icon/firefox.png" title="Mozilla Firefox"></a></li>',
'            <li><a href="http://www.opera.com/zh-cn" target="_blank"><img src="//static.21cnjy.com/kill-ie/icon/opera.png" title="Opera"></a></li>',
'            <li><a href="http://se.360.cn/" target="_blank"><img src="//static.21cnjy.com/kill-ie/icon/360.png" title="360安全浏览器（极速模式）"></a></li>',
'            <li><a href="https://support.microsoft.com/zh-cn/help/17621/internet-explorer-downloads" target="_blank"><img src="//static.21cnjy.com/kill-ie/icon/ie.png" title="最新版 Internet Explorer"></a></li>',
'            <li><a href="http://browser.qq.com/?adtag=SEM3" target="_blank"><img src="//static.21cnjy.com/kill-ie/icon/qq.png" title="QQ浏览器（极速模式）"></a></li>',
'        </ul>',
'        <div class="bs-btn"><a href="javascript:;" id="J_abandon">不升级，继续浏览</a></div>',
        '    </div>'].join("");


    
try { 
    
    var _userData = document.createElement('INPUT');
    _userData.type = "hidden";
    _userData.style.display = "none";
    _userData.addBehavior("#default#userData");
    document.body.appendChild(_userData);
    var expires = new Date();
    expires.setDate(expires.getDate() + 15); // 一个月
    _userData.expires = expires.toUTCString();
    var _key = location.hostname;
    _userData.load(_key);
    var v = _userData.getAttribute('abandon_update12');
    if (v) { 
        return false;
    }
    var _div = document.createElement('div');
    _div.innerHTML = htm;    
    document.body.appendChild(_div);
    document.getElementById('J_abandon').onclick = function () { 
        document.body.removeChild(_div);
        _userData.setAttribute('abandon_update12', 1);
        _userData.save(_key);
    };
}    
catch (e) {
    return false;
}
    
})();