package ncu.study.autopaper.common.util.htmltowp.poihtml2word;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

import ncu.study.autopaper.common.util.htmltowp.util.ReadText;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;


public class PoiHtml2Word {

    @SuppressWarnings("unused")
    public static void writeWordFile() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String currentTime = formatter.format(new Date());
        String filePath = "F:/Test/" + currentTime + ".doc";
        try {
            File fileDir = new File(filePath);//"C:/Users/JOJO/Desktop/editpaper/4324324/试卷编辑.htm"
            String content = ReadText.readFileToString("F:/Test/21.mhtml");
            byte b[] = content.getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(b);
            POIFSFileSystem poifs = new POIFSFileSystem();
            DirectoryEntry directory = poifs.getRoot();
            DocumentEntry documentEntry = directory.createDocument("WordDocument", bais);
            FileOutputStream ostream = new FileOutputStream(filePath);
            poifs.writeFilesystem(ostream);
            bais.close();
            ostream.close();
            System.out.println("生成成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Boolean writeHtmlWordFile(String fileName,String schtml) {
        Boolean isSuccess = false;
        String path = "F:/tmp/autopaper/doc/";
        String filePath = path+fileName+ ".doc";
        try {
            File fileDir = new File(filePath);
            String beforeStr = "<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" import=\"java.util.*\" %>\n" +
                    "<%@ taglib uri=\"http://java.sun.com/jsp/jstl/core\" prefix=\"c\" %>\n" +
                    "<%@ taglib prefix=\"fmt\" uri=\"http://java.sun.com/jsp/jstl/fmt\" %>\n" +
                    "\n" +
                    "<!DOCTYPE html>\n" +
                    "<html class=\" XL\">\n" +
                    "<head>\n" +
                    "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                    "    <meta name=\"renderer\" content=\"webkit\"><!--用在360中-->\n" +
                    "    <meta name=\"force-rendering\" content=\"webkit\"><!--用在其它-->\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1\">\n" +
                    "    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"<%=request.getContextPath()%>/static/images/favicon.ico\">\n" +
                    "    <meta name=\"csrf-param\" content=\"_csrf\">\n" +
                    "    <meta name=\"csrf-token\"\n" +
                    "          content=\"vO9R5HcOpyBeGVy5neQ9gdREdbOcudEUfsP9FQKBlNv0pxu8D0PvYg53Boz1gFbOnygcyeSO4FwKlc1-acD5lg==\">\n" +
                    "    <title>试卷编辑</title>\n" +
                    "    <script>\n" +
                    "        (function (doc, win) {\n" +
                    "            // 基于 window.screen.width 实现自适应布局\n" +
                    "            var screenWidth = 0,\n" +
                    "                size = 'XL',\n" +
                    "                root = doc.documentElement;\n" +
                    "            if (window.screen && screen.width) {\n" +
                    "                screenWidth = screen.width;\n" +
                    "                if (screenWidth >= 1200) size = 'XL'; // 大屏 - 1200px\n" +
                    "                else if (screenWidth < 1200) size = 'XS'; // 小屏 - 1000px\n" +
                    "            }\n" +
                    "            root.className += \" \" + size; // 标记CSS\n" +
                    "            win.SIZE = size; // 标记JS\n" +
                    "        })(document, window);\n" +
                    "\n" +
                    "        window.OT2 = {}; // 全局命名空间\n" +
                    "        OT2.AboveIE9 = true; // 默认非iE或IE9及以上\n" +
                    "        OT2.ns = function (name) {\n" +
                    "            var container = OT2;\n" +
                    "            var parts = name.split('.');\n" +
                    "            var current = '';\n" +
                    "            if (parts[0] == 'OT2') parts.shift();\n" +
                    "            while (current = parts.shift()) {\n" +
                    "                if (!container[current]) container[current] = {};\n" +
                    "                container = container[current];\n" +
                    "            }\n" +
                    "            return container;\n" +
                    "        };\n" +
                    "        var HostInfo = \"<%=request.getContextPath()%>\";\n" +
                    "        USER = {};\n" +
                    "        OT2.CSRF = {\"_csrf\": \"vO9R5HcOpyBeGVy5neQ9gdREdbOcudEUfsP9FQKBlNv0pxu8D0PvYg53Boz1gFbOnygcyeSO4FwKlc1-acD5lg==\"};\n" +
                    "    </script>\n" +
                    "    <!--[if lt IE 9]>\n" +
                    "    <script> OT2.AboveIE9 = false;</script>\n" +
                    "    <![endif]-->\n" +
                    "    <script src=\"<%=request.getContextPath()%>/static/js/lib/jquery.min.js\"></script>\n" +
                    "    <script src=\"<%=request.getContextPath()%>/static/js/lib/underscore-min.js\"></script>\n" +
                    "    <script src=\"<%=request.getContextPath()%>/static/js/extends/cookie.min.js\"></script>\n" +
                    "    <script src=\"<%=request.getContextPath()%>/static/js/lib/json3.min.js\"></script>\n" +
                    "    <script src=\"<%=request.getContextPath()%>/static/js/lib/dialog-plus.js\"></script>\n" +
                    "    <script src=\"<%=request.getContextPath()%>/static/js/extends/artDialog-config.min.js\"></script>\n" +
                    "    <script src=\"<%=request.getContextPath()%>/static/js/extends/element.min.js\"></script>\n" +
                    "    <script src=\"<%=request.getContextPath()%>/static/js/extends/localdata.min.js\"></script>\n" +
                    "    <script src=\"<%=request.getContextPath()%>/static/js/extends/util.min.js\"></script>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "    <style>html, * {\n" +
                    "        -webkit-user-select: text !important;\n" +
                    "        -moz-user-select: text !important;\n" +
                    "    }</style>\n" +
                    "</head>\n" +
                    "\n" +
                    "\n" +
                    "<body>\n" +
                    "\n" +
                    "<style>\n" +
                    "    .g-bd1 {\n" +
                    "        margin-bottom: 40px;\n" +
                    "    }\n" +
                    "\n" +
                    "    .g-mn1c > table {\n" +
                    "        width: 100%;\n" +
                    "    }\n" +
                    "\n" +
                    "    .g-mn1c,.g-sd1{border-left:1px solid #dcdcdc}.club-grids .grid-dragging,.drag-wire-dragging{visibility:hidden}body{background:#efefef}.w{width:100%}::selection{background:#71b38d;color:#fff}::-moz-selection{background:#71b38d;color:#fff}.g-bd1,.header{background:#fff}.header{height:60px;line-height:60px;box-shadow:0 0 10px rgba(0,0,0,.3);border-bottom:1px solid #dcdcdc}.club-summary,.editset h3{height:40px;line-height:40px}.header-inner a{display:inline-block;margin:0 14px;font-size:12;color:#999}.header-inner a i{margin-right:5px;margin-bottom:2px}.header-logo{float:left}.header-nav,.user{float:right}.header-nav a:hover{color:#19B478}.user a span{margin-left:5px;color:red}.g-bd1{margin:0 auto;min-height:1048px}.g-sd1{position:relative;float:left;width:279px;margin-right:-280px}.g-mn1{float:right;width:100%}.g-mn1c{margin-left:0px;margin-right: 500px}.fixed .g-sd1{position:fixed;top:0;background-color:#fff}.editset{font-size:12px;color:#333}.editset h3{background:#efefef;font-size:14px;color:#333;font-weight:700;padding:0 20px;position:relative;margin-bottom:1px}.editset h3 span{position:absolute;right:20px;top:0;font-size:12px;font-weight:400;color:#666;cursor:pointer}.check-group ul li span i,.editset-del i,.radio-group ul li span i{position:relative;top:-1px}.paper-club{margin-bottom:20px}.club-summary{margin:0 15px 10px;border-bottom:1px dashed #dcdcdc}.club-summary>div{float:left}.club-summary .t1{margin-right:-33%;width:33%}.club-summary .t3{margin-left:-33%;width:33%;text-align:right}.club-summary .t2{text-align:center;display:block}.club-summary strong{font-weight:400;color:red}.club-type{padding:10px 10px 0;zoom:1}.club-type-wrap{margin:0 10px;position:relative;zoom:1}.club-type-wire{border:1px solid #fff;background:#fff;cursor:move}.club-type-wire:hover{border:1px solid #29c36b}.club-type .club-hd{margin-bottom:15px}.club-type .club-hd span{font-size:14px;font-weight:700}.club-type .club-hd a{font-size:12px}.club-type .club-hd a:hover{color:#29c36b}.club-grids{zoom:1;overflow:hidden;position:relative}.club-type .club-hd .t-del{color:#999;margin-left:10px}.club-grids>div{margin-right:-15px;zoom:1}.club-grids span{border:1px solid #dcdcdc;line-height:22px;height:22px;width:22px;text-align:center;margin-right:10px;margin-bottom:10px;float:left;cursor:move;background:#fff}#clone-drag-grid,.club-grids span:hover{background:#29c36b;color:#fff}.club-grids span:hover{border-color:#29c36b;cursor:move}#clone-drag-grid,#clone-drag-wire{border:1px solid #29c36b;cursor:move}#clone-drag-wire{background:#fff}.editset .overflow{overflow:auto;resize:vertical}.check-group,.radio-group{border-bottom:1px solid #dcdcdc;overflow:hidden}.radio-group ul{padding:20px 0}.radio-group ul li{width:33.33%;margin-bottom:20px;float:left;line-height:18px;text-align:center}.check-group ul{padding:0 0 0 20px;margin:20px 0 15px}.check-group ul li{width:50%;padding-bottom:15px;float:left;line-height:18px;display:inline;zoom:1}.editset-type .btn,a.download-btn{display:inline-block;font-size:14px}.check-group li span,.radio-group li span{cursor:pointer}.check-group li span.checked,.check-group li span:hover,.radio-group li span.checked,.radio-group li span:hover{color:#09a74d}#xbar-clone-div{background:#f3f3f3}#xbar-clone-div .numbar{background-color:#17B55B}#xbar-clone-div .numtxt span{color:#17B55B}.editset-type{padding:0 0 30px;border-bottom:1px solid #dcdcdc}.editset-typeitem{margin-bottom:5px;overflow:hidden;padding:5px 0;border:1px solid transparent}.editset-del,.editset-typetit,.numbarbg,.numtxt{float:left}.editset-typetit{width:75px;height:14px;line-height:14px;overflow:hidden;text-align:right}.editcon h1,.editcon h2,.editfooter,.editset-type .btn,.mark-table table,.paper-title>h3{text-align:center}.numbarbg{width:100px;background:#e5e5e5;margin-left:10px;cursor:move}.numbar{height:12px;background:#e38b50}.numtxt{margin-left:10px;line-height:14px}.numtxt span{color:#eb5e00}.editset-del{margin-left:20px;cursor:pointer}.editset-type .btn{width:100px;height:30px;line-height:28px;margin-left:25px;background:#17b55b;border:none;border-radius:5px;color:#fff;font-family:\"Microsoft YaHei\",\"\\5fae\\8f6f\\96c5\\9ed1\",arial,\"\\5b8b\\4f53\"}.editset-type .btn:hover{background:#09a74d}.editset-type .dragging{background-color:#f6f6f6;color:#ccc}.editfooter{position:fixed;bottom:0;left:0;width:100%;overflow:hidden;clear:both;height:60px;line-height:60px;background:#eee;font-size:14px;border-top:1px solid #dcdcdc;box-shadow:0 -1px 5px 0 rgba(0,0,0,.3);z-index:600}.editfooter i{margin-right:5px}.editfooter a{margin-right:28px}.editfooter a:hover{color:#52C684}a.download-btn{background:#17b55b;height:35px;line-height:35px;padding:0 45px;color:#fff;border-radius:5px}.download-btn i{margin-right:5px}.download-btn:hover{background:#09a74d;color:#fff!important}.editcon{padding:10px;font-size:14px;color:#333}.editcon-silder{width:50px;background:url(../images/editing.png) 20px 180px no-repeat;border-right:1px dashed #dcdcdc}.editcon h1{height:50px;line-height:50px}.editcon h1>span{line-height:50px;font-size:18px;color:#333}.editcon h2{margin-top:8px;font-size:16px;color:#333}.editcon,.editcon .test-time>p,.stu-info{line-height:18px;margin-top:20px}.stu-info{overflow:hidden}.stu-info li{float:left;display:inline;margin-right:1em}.paper-btngroup,.paper-part .paper-sorting:hover .question-btngroup,.paper-part .paper-sorting:hover .types-btngroup,.paper-sorting .question-answer-area{display:none}.stu-info li span{color:#ccc}.test-time p>span{margin-right:24px;font-size:14px;color:#333}.mark-table{padding:0 60px}.mark-table table{margin:20px auto;width:100%;font-size:14px;color:#333;border:1px solid #dcdcdc;border-bottom:none}.mark-table table tr{height:40px;line-height:40px}.mark-table table tr th{text-align:center;border-bottom:1px solid #dcdcdc}.mark-table table tr td{border-left:1px solid #dcdcdc;border-bottom:1px solid #dcdcdc}.rule{margin-top:20px;overflow:hidden}.rule>div{margin-top:10px;line-height:2em;float:left;clear:both}.paper-title{position:relative;margin:15px 0 0}.paper-title>h3{font-size:16px;line-height:18px;color:#333;font-weight:700}.question-btngroup a,.sort-btn,.types-btngroup a,button.cancel,button.confirm{font-size:12px;height:30px;line-height:30px}.paper-title span{font-size:12px;color:#999;position:absolute;bottom:0;left:0}.paper-question,.paper-question-list,.paper-types{position:relative}.paper-section{border:1px solid transparent;margin-top:15px}.paper-part .paper-sorting{border:1px solid #90d3ad}.paper-part .paper-sorting:hover .paper-types{border:1px solid transparent}.paper-sorting .paper-question{background-color:#eee;height:24px;overflow:hidden}.paper-section:hover>.types-btngroup,.paper-sorting .paper-btngroup,.paper-types:hover .types-btngroup,.sort-btn{display:block}.paper-border{border:1px solid #90d3ad}.sorting-section .paper-types{background-color:#D4F3E1}.paper-types{margin:0 0 15px;height:80px;background:#fff;border:1px solid transparent}.paper-types table,.sort-btn{background:#fff;text-align:center}.paper-types table{margin:10px;width:100px;float:left;border:1px solid #dcdcdc;border-bottom:none}.paper-types table tr td,.paper-types table tr th{width:50%;height:30px;line-height:30px;text-align:center;border-bottom:1px solid #dcdcdc}.paper-types table tr td{border-left:1px solid #dcdcdc}#clone-div,.paper-types:hover,.sort-btn{border:1px solid #90d3ad}.paper-types p{float:left;line-height:80px;margin-left:20px}.sort-btn{width:60px;color:#019e44;cursor:pointer}.sort-btn:hover{background:#29c36b;color:#fff}.paper-question-list .dragging{color:#ccc!important;background-color:#f6f6f6;border:1px dashed #6FD299}.paper-question{border:1px solid #fff;background:#fff;zoom:1;line-height:30px;margin:10px 0;cursor:move}.paper-question img{max-width:100%}.paper-sorting .paper-question{margin:10px}.question-num{padding:0 10px}.question-s{overflow:hidden;zoom:1}.question-s span.op-item{float:left}.question-btngroup,.types-btngroup{display:none;position:absolute;top:-32px;right:-1px;overflow:hidden;border-left:1px solid #90d3ad}.question-btngroup a,.types-btngroup a{float:left;min-width:80px;background:#fff;color:#019e44;text-align:center;border:1px solid #90d3ad;border-left:none;cursor:pointer}.paper-section .types-btngroup a{min-width:60px;padding:0 10px}.types-btngroup .del-btn i,.types-btngroup .score-btn i{margin-right:6px;margin-top:-3px}.question-btngroup a i{margin-top:-3px;margin-right:3px}.question-btngroup a:hover,.types-btngroup a:hover{background:#29c36b;color:#fff}.paper-question:hover{border:1px solid #90d3ad}.paper-question:hover .question-btngroup{display:block}.paper-btngroup{margin:20px 0;text-align:center}button.cancel,button.confirm{padding:0 15px;text-align:center;border:none;border-radius:5px}.confirm{background:#3db06e;color:#fff}.cancel{margin-left:10px;background:#dfdfdf;color:#333}.confirm:hover{background:#295}.cancel:hover{background:#b9b9b9}.contenteditable+input,.rule textarea{padding:5px;font-family:\"微软雅黑\";background:#f0e1d8}#paper-body{min-height:300px}.contenteditable{cursor:pointer;border:1px solid transparent}.contenteditable:hover{background-color:#f0e1d8;border:1px solid #f1b48f}.contenteditable+input{border:1px solid #f1b48f;border-radius:5px}.test-title h1 .contenteditable+input{width:600px;height:25px;margin-top:12px;padding:5px;font-size:18px;color:#333;font-weight:700}.test-title h2 .contenteditable+input{height:22px;width:160px;font-size:16px;color:#333;font-weight:700}.rule textarea{width:300px;height:60px;line-height:2em;font-size:14px;margin-top:10px;border:1px solid #f1b48f;border-radius:5px}.paper-title span.contenteditable+input{position:absolute;left:0;top:0;font-size:12px}.paper-title em.contenteditable+input{height:22px;width:200px;font-size:16px;font-weight:700}.test-time input{width:80px}.test-time .contenteditable{font-family:Arial;font-size:12px}.paper-types .contenteditable+input{font-weight:700;font-size:14px}.wan-xing-list{margin:10px 20px;line-height:18px}.wan-xing-list li{margin:12px 0;clear:both;overflow:hidden;zoom:1}.wan-xing-list li div{margin-left:30px;float:left;width:100%}.wan-xing-list li em{font-weight:400;height:18px;width:30px;float:left;margin-right:-30px}.wan-xing-list li p{overflow:hidden;zoom:1;margin-left:10px}.wan-xing-list li span{float:left}.question-answer-area{margin-left:20px;margin-top:20px}.op-items .op-item{padding-bottom:10px}.exam-qlist .question-txt{margin-top:0}.q-scoreval{font-size:14px;margin-right:10px;color:#999;font-weight:400}.question-txt img{vertical-align:middle}::-webkit-scrollbar{width:8px;height:8px;background-color:#f5f5f5}::-webkit-scrollbar-track{-webkit-box-shadow:inset 0 0 6px rgba(0,0,0,.3);border-radius:4px;background-color:#f5f5f5}::-webkit-scrollbar-thumb{border-radius:4px;-webkit-box-shadow:inset 0 0 6px rgba(0,0,0,.3);background-color:#9e9e9e}.new-side-types{padding:20px;font-family:\"Microsoft YaHei\",\"\\5fae\\8f6f\\96c5\\9ed1\",arial,\"\\5b8b\\4f53\"}.new-side-types .label{margin-bottom:10px;font-weight:700}.new-side-types .custom-checbox-g{margin-bottom:20px}.new-side-types .custom-radio-g{margin-bottom:30px}.new-side-types .custom-checbox-g .custom-checkbox{margin-right:30px;cursor:pointer;float:left;margin-bottom:10px;white-space:nowrap}.new-side-types .custom-radio-g .custom-radio{margin-right:40px;cursor:pointer}.new-side-types span>i{margin-right:3px;margin-top:-2px}.new-side-types span:hover{color:#17B55B}#J_PaperLayout,#J_PaperLayout .g-sd1{overflow:hidden}.editset h3 .toggle-sd-box:hover{color:#74e8a6}.toolbars{padding:20px 15px}.toolbars i{margin-right:5px}.toolbars a:hover{color:#52C684}.toolbars a.download-btn{display:block;margin-bottom:20px;height:40px;line-height:40px;text-align:center}.toolbars a.download-btn+a{margin-left:0}.toolbars a+a{margin-left:10px;white-space:nowrap}.p-replace-wrap{position:fixed;height:100%;top:0;right:-926px;z-index:1029;width:926px;background:#fff;transition:all .2s linear}.mactive{right:0}.p-con-hd{height:50px;position:absolute;width:100%;background:#fff;z-index:10;border-bottom:1px solid #dcdcdc}.p-con-num{padding-top:10px}.p-con-num li{float:left;padding:0 25px}.p-q-orgin p:first-child,.p-q-type span{padding-left:27px}.p-con-num li a{display:block;width:32px;height:32px;line-height:32px;font-size:18px;color:#000;text-align:center;border-radius:50%}.p-con-num li a.active,.p-con-num li a:hover{color:#fff;background:#17b55b}.change-btn{position:absolute;top:10px;right:26px;width:70px;height:30px;line-height:30px;text-align:center;font-size:14px;color:#17b55b;background:#fff;border-radius:5px;border:1px solid #17b55b}.p-content,.p-q-ft{position:absolute;width:100%}.change-btn:hover{color:#8ad1a8;border-color:#8ad1a8}.p-q-orgin,.p-q-type{line-height:38px;font-size:12px;color:#969292}.p-q-type span{padding-right:10px}.p-q-use{margin-right:158px}.p-q-con{padding:10px 27px}.p-content{padding:50px 0;height:80%;overflow:auto;z-index:9}.p-q-ft{bottom:0;height:50px;background:#f9f9f9;text-align:center;border-top:1px solid #dcdcdc;z-index:10}.p-q-ft a{display:inline-block;margin:10px 12px 0;width:70px;height:30px;line-height:30px;text-align:center;font-size:14px;color:#17b55b;border-radius:5px;border:1px solid #17b55b}.p-q-ft a.replace-btn{background:#17b55b;color:#fff}.p-q-ft a.p-close{background:#fff}.p-q-ft a.replace-btn:hover{background:#09a74d}.p-q-ft a.p-close:hover{color:#8ad1a8;border-color:#8ad1a8}.shade-bg{position:fixed;top:0;left:0;z-index:1029;width:100%;height:100%;background:#000;opacity:.7;filter:alpha(opacity=70)}.save_title{text-align:center}.save_title input{color:#333;font-size:12px;font-weight:700;height:20px;margin-top:12px;padding:5px;width:300px;border:1px solid #f1b48f;border-radius:5px;background:#f0e1d8;font-family:\"微软雅黑\"}.dj-search-exam{border:none}.loading1{display:none;margin-top:50px;position:absolute;top:0;left:0;z-index:10;width:100%;height:100%;text-align:center;background:rgba(255,255,255,.3)}.loading1 img{padding-top:220px}\n" +
                    "</style>\n" +
                    "<div class=\"g-bd1 g-container f-cb\" id=\"J_PaperLayout\">\n" +
                    "    <div class=\"g-mn1\">\n" +
                    "\n" +
                    "        <div id=\"paperTemplate\">\n" +
                    "            <div class=\"g-mn1c\">\n" +
                    "<%--模板数据开始--%>";
            String endStr = "\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</div>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/element.min.js\"></script>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/highcharts.js\"></script>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/error-report.min.js\"></script>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/paper.min.js\"></script>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/paper-part.min.js\"></script>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/paper-section.min.js\"></script>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/question-txt.min.js\"></script>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/paper-question.min.js\"></script>\n" +
                    "\n" +
                    "<script>\n" +
                    "    $(document).ready(function(){\n" +
                    "        var bigCount = ${paperQCInfo.size()};\n" +
                    "        for(var i=0;i<bigCount;i++){\n" +
                    "            var a = i+1;\n" +
                    "            $(\"#J_PaperScore011\").append(\"<td>\"+translateNum(a)+\"</td>\");\n" +
                    "            $(\"#J_PaperScore021\").append(\"<td>&nbsp;</td>\");\n" +
                    "        }\n" +
                    "        // TODO 优化数字转化\n" +
                    "        function translateNum(a){\n" +
                    "            var arr = new Array(13)\n" +
                    "            arr[0] = \"零\";arr[1] = \"一\";arr[2] = \"二\";arr[3] = \"三\";arr[4] = \"四\";arr[5] = \"五\";\n" +
                    "            arr[6] = \"六\";arr[7] = \"七\";arr[8] = \"八\";arr[9] = \"九\";arr[10] = \"十\";arr[11] = \"十一\";arr[12] = \"十二\";\n" +
                    "            return arr[a];\n" +
                    "        }\n" +
                    "    });\n" +
                    "    function paper_download(){\n" +
                    "        var data = {};\n" +
                    "        XDoc.to(baidu.template('paperTemplate', data), \"docx\", {}, \"_blank\");\n" +
                    "    }\n" +
                    "</script>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/global.min.js\"></script>\n" +
                    "<a class=\"return\" href=\"javascript:;\" style=\"right: -52.5px; display: none;\"><i class=\"icona-top\"></i></a>\n" +
                    "<script src=\"<%=request.getContextPath()%>/static/js/extends/yii.js\"></script>\n" +
                    "</body>\n" +
                    "</html>";
            String content = beforeStr + schtml + endStr;
            byte b[] = content.getBytes("UTF-8");
            ByteArrayInputStream bais = new ByteArrayInputStream(b);
            POIFSFileSystem poifs = new POIFSFileSystem();
            DirectoryEntry directory = poifs.getRoot();
            DocumentEntry documentEntry = directory.createDocument("WordDocument", bais);
            FileOutputStream ostream = new FileOutputStream(filePath);
            poifs.writeFilesystem(ostream);
            bais.close();
            ostream.close();
            System.out.println("生成成功");
            isSuccess = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }


    public static void main(String[] args) {
        writeWordFile();
    }

}
