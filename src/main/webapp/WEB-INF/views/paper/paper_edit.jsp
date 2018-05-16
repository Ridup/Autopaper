<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html class=" XL">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="renderer" content="webkit"><!--用在360中-->
    <meta name="force-rendering" content="webkit"><!--用在其它-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath()%>/static/images/favicon.ico">
    <meta name="csrf-param" content="_csrf">
    <meta name="csrf-token"
          content="vO9R5HcOpyBeGVy5neQ9gdREdbOcudEUfsP9FQKBlNv0pxu8D0PvYg53Boz1gFbOnygcyeSO4FwKlc1-acD5lg==">
    <title>试卷编辑</title>
    <script>
        (function (doc, win) {
            // 基于 window.screen.width 实现自适应布局
            var screenWidth = 0,
                size = 'XL',
                root = doc.documentElement;
            if (window.screen && screen.width) {
                screenWidth = screen.width;
                if (screenWidth >= 1200) size = 'XL'; // 大屏 - 1200px
                else if (screenWidth < 1200) size = 'XS'; // 小屏 - 1000px
            }
            root.className += " " + size; // 标记CSS
            win.SIZE = size; // 标记JS
        })(document, window);

        window.OT2 = {}; // 全局命名空间
        OT2.AboveIE9 = true; // 默认非iE或IE9及以上
        OT2.ns = function (name) {
            var container = OT2;
            var parts = name.split('.');
            var current = '';
            if (parts[0] == 'OT2') parts.shift();
            while (current = parts.shift()) {
                if (!container[current]) container[current] = {};
                container = container[current];
            }
            return container;
        };
        var HostInfo = "<%=request.getContextPath()%>";
        USER = {};
        OT2.CSRF = {"_csrf": "vO9R5HcOpyBeGVy5neQ9gdREdbOcudEUfsP9FQKBlNv0pxu8D0PvYg53Boz1gFbOnygcyeSO4FwKlc1-acD5lg=="};
    </script>
    <!--[if lt IE 9]>
    <script> OT2.AboveIE9 = false;</script>
    <![endif]-->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/base.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/spriter-mix.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/ui-dialog.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/artDialog-skin-ot2.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/main.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/popup.min.css">
    <script src="<%=request.getContextPath()%>/static/js/lib/jquery.min.js"></script>
    <script type="text/javascript">$.ajaxSetup({cache: false});</script>
    <script src="<%=request.getContextPath()%>/static/js/lib/underscore-min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/cookie.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lib/json3.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lib/dialog-plus.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/artDialog-config.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/element.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/localdata.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/util.min.js"></script>


        <link rel="stylesheet" href="<%=request.getContextPath()%>/static/layui/css/layui.css">
        <script src="<%=request.getContextPath()%>/static/layui/layui.js"></script>

    <style>html, * {
        -webkit-user-select: text !important;
        -moz-user-select: text !important;
    }</style>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss">
</head>


<body>
<!--[if lt IE 7]>
<link href="<%=request.getContextPath()%>/static/css/kill-ie.css" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/static/js/extends/kill-ie.js"></script>
<![endif]-->
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/paperediting.min.css">
<style>
    .g-bd1 {
        margin-bottom: 40px;
    }

    .g-mn1c > table {
        width: 100%;
    }
</style>
<div class="header">
    <div class="header-inner g-container f-cb">
        <div class="header-logo">
            <a href="<%=request.getContextPath()%>/index.do">
                <img src="<%=request.getContextPath()%>/static/images/login-logo1.png" alt="自动组卷平台" title="自动组卷平台">
            </a>
        </div>
        <div class="header-logo-sd f-fr">
            <div class="user f-fr f-pr topbar-dropmap">
                <a href="<%=request.getContextPath()%>/ucenter/" target="_blank">${user.nickName}<i class="icona-tri ml"></i></a>
                <div class="drop-bd" style="display: none;">
                    <ul>
                        <li><a href="<%=request.getContextPath()%>/ucenter/download_record.do" target="_blank">下载记录</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/generate_record.do" target="_blank">组卷记录</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/test_record.do" target="_blank">测试记录</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/error_record.do" target="_blank">纠错记录</a></li>
                        <c:if test="${loginUser.userType=='1'}"><li><a href="<%=request.getContextPath()%>/ucenter/question_in_record.do" target="_blank">试题录入记录</a></li></c:if>
                        <li><a href="<%=request.getContextPath()%>/ucenter/error_question.do" target="_blank">错题本</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/myfavorite.do" target="_blank">我的收藏</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/index.do" target="_blank">个人信息</a></li>
                        <li class="split-line"></li>
                        <li><a data-method="post" href="<%=request.getContextPath()%>/user/logout.do">退出</a></li>
                    </ul>
                    <span class="icona-dia-tri"></span>
                </div>
            </div>
            <div class="user f-fr"><a href="<%=request.getContextPath()%>/ucenter/u-msg.do"><i class="icona-xinxi"></i>消息<span>(0)</span></a></div>
            <div class="header-nav">
                <a href="<%=request.getContextPath()%>/index.do" class="help"><i class="icona-home"></i>网站首页</a>
                <span class="split"></span>
                <c:if test="${loginUser.userType=='1'}">
                    <a href="<%=request.getContextPath()%>/question/question_in.do" class="help" target="_blank"><i class="icona-leixing"></i>试题录入</a>
                    <span class="split"></span>
                </c:if>
                <a href="<%=request.getContextPath()%>/main/help.do" class="help" target="_blank"><i class="icona-help"></i>帮助中心(可请求一个操作文档)</a>
                <span class="split"></span>
            </div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function () {
        var param = window.location.search.substr(1, 4);
        if (param == "tips") {
            var tips = window.location.search.substring(6);
            console.log(tips);
            if (tips == "e01") {
                contentTips = "请重新登录！";
                layer.alert("<span style='margin-left: 70px;text-align: center;color:#e65439'>" + contentTips + "</span>");
            }
            if (tips == "e02") {
                contentTips = "试题篮为空，请重新添加试题！";
                layer.alert("<span style='margin-left: 70px;text-align: center;color:#e65439'>" + contentTips + "</span>");
            }
        }
        $(".topbar-dropmap").hover(function () {
            $(".drop-bd").css("display","block");
        },function () {
            $(".drop-bd").css("display","none");
        });

        /* 判断UCenter位置*/
        /*   if(ucenter_position!=null&&ucenter_position!=""){
               $("#"+ucenter_position).css({"background-color": "#3db06e","color":"#FFF"});
               $("#"+ucenter_position).unbind().unbind();
           }*/
    });
</script>
<!--头部结束----------------------------------->




<div class="breadcrumb g-container">
    <i class="icona-dingwei"></i>当前位置：
    <a href="<%=request.getContextPath()%>/index.do">首页</a>
</div>
<!--头部结束--------------------------------------->






<div class="g-bd1 g-container f-cb" id="J_PaperLayout">
    <div class="g-sd1">
        <div class="toolbars" style="padding-bottom: 0px;">
            <a href="javascript:;" class="download-btn" onclick="paper_download()"><i
                    class="icona-download1"></i>下载试卷</a>
            <a href="javascript:;" class="download-btn" onclick="paper_save()"><i
                    class="icona-save"></i>保存组卷</a><%--
            <a href="javascript:;" onclick="paper.setAnswerSheet()"><i class="icona-dtk2"></i>下载答题卡</a>
            <a href="javascript:;" onclick="paper.showPie()"><i class="icona-fenxi2"></i>试卷分析</a>
            <a href="javascript:;" onclick="paper.save()"><i class="icona-save2"></i>保存组卷</a>--%>
        </div>
        <div class="editset f-usn" onselectstart="return false">
            <h3>试卷结构调整<span class="toggle-sd-box toggle-sd-set">收起</span></h3>
            <div id="sd-set-wire">
                <div class="radio-group">
                    <ul id="J_PaperSetRadio">
                        <li>
    <span class="radiobox">
    <i class="icona-radio"></i>
    <input type="radio" name="" value="simple" checked="" style="display: none;">
    简易模板
    </span>
                        </li>

                        <li>
    <span class="radiobox">
    <i class="icona-radio"></i>
    <input type="radio" name="" value="common" style="display: none;">
    普通模板
    </span>
                        </li>

                        <li>
    <span class="radiobox checked">
    <i class="icona-radio"></i>
    <input type="radio" name="" value="normal" style="display: none;">
    正式模板
    </span>
                        </li>
                    </ul>
                </div>
                <div class="check-group">
                    <ul id="J_PaperSetCheck">
                        <li>
    <span class="checkbox   checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="1" style="display: none;">
    密封线
    </span>
                        </li>

                        <li>
    <span class="checkbox   checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="2" style="display: none;">
    大题评分区
    </span>
                        </li>

                        <li>
    <span class="checkbox  checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="3" checked="" style="display: none;">
    主标题
    </span>
                        </li>

                        <li>
    <span class="checkbox   checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="4" style="display: none;">
    注意事项
    </span>
                        </li>

                        <li>
    <span class="checkbox   checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="5" style="display: none;">
    副标题
    </span>
                        </li>

                        <li>
    <span class="checkbox   checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="6" style="display: none;">
    分卷
    </span>
                        </li>

                        <li>
    <span class="checkbox   checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="7" style="display: none;">
    考试时间
    </span>
                        </li>

                        <li>
    <span class="checkbox   checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="8" style="display: none;">
    分卷注释
    </span>
                        </li>

                        <li>
    <span class="checkbox   checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="9" style="display: none;">
    考生填写
    </span>
                        </li>

                        <li>
    <span class="checkbox  checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="10" checked="" style="display: none;">
    分大题
    </span>
                        </li>

                        <li>
    <span class="checkbox   checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="11" style="display: none;">
    总评分
    </span>
                        </li>

                        <li>
    <span class="checkbox  checked">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value="12" checked="" style="display: none;">
    大题注释
    </span>
                        </li>
                    </ul>
                </div>
            </div>
            <h3>试题统计<span class="toggle-sd-box">收起</span></h3>
            <div class="editset-type">
                <div id="J_PaperTypes" class="overflow" style="height: 0px;">
                    <div class="paper-club">
                        <div class="club-summary f-cb">
                            <div class="t1">分数：<strong>13分</strong></div>
                            <div class="w"><span class="t2">题数：<strong>5</strong></span></div>
                            <div class="t3">难度：<strong>容易</strong></div>
                        </div>
                        <div class="club-type-wrap">

                            <div class="club-type-wire drag-wire" _cid="type_1" data-typename="单选题">
                                <div class="club-type">
                                    <div class="club-hd f-cb">
                                        <span class="f-fl" title="单选题">一、单选题</span>
                                        <div class="f-fr">
                                            <a href="javascript:;" class="t-order"
                                               onclick="paper.askOrder(type_1);">排序</a>
                                            <a href="javascript:;" class="t-del"
                                               onclick="paper.deleteQuestions(单选题)">删除</a>
                                        </div>
                                    </div>
                                    <div class="club-grids">
                                        <div class="f-cb">

                                            <span class="drag-grid" _qid="7324347">1</span>

                                            <span class="drag-grid" _qid="7324353">2</span>

                                            <span class="drag-grid" _qid="7324349">3</span>

                                            <span class="drag-grid" _qid="7324367">4</span>

                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="club-type-wire drag-wire" _cid="type_2" data-typename="解答题">
                                <div class="club-type">
                                    <div class="club-hd f-cb">
                                        <span class="f-fl" title="解答题">二、解答题</span>
                                        <div class="f-fr">
                                            <a href="javascript:;" class="t-order"
                                               onclick="paper.askOrder(type_2)">排序</a>
                                            <a href="javascript:;" class="t-del"
                                               onclick="paper.deleteQuestions(解答题)">删除</a>
                                        </div>
                                    </div>
                                    <div class="club-grids">
                                        <div class="f-cb">

                                            <span class="drag-grid" _qid="7324395">5</span>

                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <a href="https://zujuan.21cnjy.com/question/index" class="btn">继续选题</a>
                <a href="javascript:;" onclick="paper.addNewType()" class="btn">+自定义题型</a>
            </div>
        </div>
    </div>
    <div class="g-mn1">

        <div id="paperTemplate">
            <div class="g-mn1c">




























                <%--  试卷内容开始-----------------------------------------------------------------------------------------------------------------------------------------%>
                <table>
                    <tbody>
                    <tr>
                        <td data-paperset="1" class="editcon-silder" style="display: table-cell;"></td>
                        <td>
                            <div class="editcon">
                                <div class="test-title">
                                    <h1 data-paperset="3">
                            <span class="contenteditable" data-edit="title" id="paper-title">
                            <%
                                Date date = new Date();
                                pageContext.setAttribute("d", date);
                            %>
                            <fmt:formatDate value="${d}" type="date" dateStyle="long"/>
                                ${questionBasketInfo.gradeName}${questionBasketInfo.courseName}试卷</span>
                                    </h1>
                                    <h2 data-paperset="5" style="display: block;"><span data-edit="subtitle"
                                                                                        class="contenteditable">${questionBasketInfo.courseName}考试</span></h2>
                                </div>
                                <div data-paperset="7" class="test-time" style="display: block;">
                                    <p><span>考试时间：<i class="contenteditable" data-edit="examtime">${paperResponsePojo.totalTime}</i> 分钟</span><span>满分：<i
                                            class="contenteditable" data-edit="score">${paperResponsePojo.totalScore}</i> 分</span></p>
                                </div>
                                <ul data-paperset="9" class="stu-info" style="display: block;">
                                    <li>姓名：<span>____________</span></li>
                                    <li>班级：<span>____________</span></li>
                                    <li>学号：<span>____________</span></li>
                                </ul>
                                <div data-paperset="11" class="mark-table" style="display: block;">
                                    <table id="J_PaperScore">
                                        <tbody>
                                        <tr id="J_PaperScore01">
                                            <th>题号</th>

                                        </tr>
                                        <tr id="J_PaperScore02">
                                            <th>评分</th>

                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div data-paperset="4" class="rule" style="display: block;">
                                    <p>* 注意事项：</p>
                                    <div class="contenteditable" data-edit="notes">1、填写答题卡的内容用2B铅笔填写<br>2、提前 xx 分钟收取答题卡
                                    </div>
                                </div>
                                <div id="J_PaperBody">








                                    <%-------------------------------------------------------------------------------------------------------------------------------------------%>
                                    <%
                                        int countNum = 1;
                                        pageContext.setAttribute("countNum", countNum);
                                    %>
                                    <c:forEach items="${paperQCInfo}" var="paperQC" varStatus="vs">
                                        <div class="paper-part">
                                            <div class="paper-section" _cid="type_1">
                                                <div data-paperset="10" class="paper-types">
                                                    <table data-paperset="2" style="">
                                                        <tbody>
                                                        <tr>
                                                            <th>阅卷人</th>
                                                            <td></td>
                                                        </tr>
                                                        <tr>
                                                            <th>得&nbsp;&nbsp;分</th>
                                                            <td></td>
                                                        </tr>
                                                        </tbody>
                                                    </table>
                                                    <p><strong><b class="t-order">${paperQC.typeNumName}</b>、<span class="contenteditable"
                                                                                                                   data-edit="type">${paperQC.questionTypeName}</span><span
                                                            data-paperset="12">（共<b class="t-num">${paperQC.questionCount}</b>题；共<b
                                                            class="t-score">${paperQC.questionTypeScore}</b>分；共<b
                                                            class="t-score">${paperQC.questionTypeTime}</b>分钟）</span></strong></p>
                                                    <div class="types-btngroup">
                                                        <a class="score-btn J_MultiSetScore" href="javascript:;"><i
                                                                class="icona-jiexi1"></i>批量设置得分</a>
                                                        <a class="sort-btn J_SecSortGroup"><i class="icona-sort"></i>排序</a>
                                                        <a class="del-btn J_DelQByType" href="javascript:;"><i
                                                                class="icona-del3"></i>删除</a>
                                                    </div>
                                                </div>
                                                <div class="paper-question-list f-usn" onselectstart="return false">
                                                    <!-- paper-question -->

                                                    <c:forEach items="${paperQC.questionResponsePojos}" var="question" varStatus="questionIndex">
                                                        <div class="paper-question f-usn" onselectstart="return false"
                                                             id="question-${question.questionId}">
                                                            <div class="question-txt">
                                                                <div class="question-num"><span class="q-sn"><c:out value="${countNum+questionIndex.index}"></c:out></span>. <span
                                                                        class="q-scoreval">${question.questionScore}（分）</span>${question.questionContent}

                                                                </div>

                                                                <div class="question-answer-area">

                                                                    <div class="question-s op-items">
                                                                        <c:if test="${question.questionType==101}">
                                                                            <div class="exam-s">
                            <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                <span class="op-item-nut" style="margin-top: 4px;">A . </span>
                                <span class="op-item-meat" style="margin-top: 4px;">
                                        ${question.selectionA}
                                </span>
                            </span>
                                                                                <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                 <span class="op-item-nut" style="margin-top: 4px;">B . </span>
                                 <span class="op-item-meat" style="margin-top: 4px;">
                                         ${question.selectionB}
                                 </span>
                             </span>
                                                                                <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                  <span class="op-item-nut" style="margin-top: 4px;">C . </span>
                                  <span class="op-item-meat" style="margin-top: 4px;">
                                          ${question.selectionC}
                                  </span>
                              </span>
                                                                                <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                   <span class="op-item-nut" style="margin-top: 4px;">D . </span>
                                   <span class="op-item-meat" style="margin-top: 4px;">
                                           ${question.selectionD}
                                   </span>
                               </span>
                                                                            </div>
                                                                        </c:if>
                                                                        <c:if test="${question.questionType==102}">
                                                                            <div class="exam-s">
                                    <span class="op-item" style="width: 200px; margin-right: 0px; height: 32px; clear: none;">
                                <i class="layui-icon">&#xe605;</i> 对
                            </span>
                                                                                <span class="op-item" style="width: 200px; margin-right: 0px; height: 32px; clear: none;">
                                <i class="layui-icon">&#x1006;</i> 错
                            </span>
                                                                            </div>
                                                                        </c:if>
                                                                    </div>
                                                                </div>


                                                            </div>
                                                            <!-- question-txt -->
                                                            <div class="question-btngroup">
                                                                <a target="_blank"
                                                                   href="<%=request.getContextPath()%>/question/detail/${question.questionId}"
                                                                   class="jx-btn"><i class="icona-jiexi1"></i>答案解析</a>
                                                                <a class="score-btn" href="javascript:;"><i
                                                                        class="icona-jiexi1"></i>设定得分</a>
                                                                <a class="ht-btn" href="javascript:;"><i class="icona-exchange"></i>换题</a>
                                                                <a class="zy-btn" href="javascript:;"><i class="icona-shift"></i>转移</a>
                                                                <a class="sc-btn" href="javascript:;"
                                                                   onclick="OT2.QCollect(this, ${question.questionId})"><i
                                                                        class="icona-shoucangs"></i>收藏</a>
                                                                <a class="jc-btn" href="javascript:;"
                                                                   onclick="OT2.ErrorReport(${question.questionId})"><i class="icona-jiucuo1"></i>纠错</a>
                                                                <a class="del-btn" href="javascript:;"><i class="icona-del3"></i>删除</a>
                                                            </div>
                                                        </div>
                                                    </c:forEach>
                                                    <c:set var="countNum" value="${countNum+paperQC.questionCount}"></c:set>

                                                </div>
                                                <div class="paper-btngroup">
                                                    <button class="confirm">确定</button>
                                                    <button class="cancel">取消</button>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>

                                    <%-------------------------------------------------------------------------------------------------------------------------------------------%>








                                </div>
                            </div>

                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/question-analytic.min.css">
<script type="text/template" data-template="paper-score">
    <tr>
        <th>题号</th>
        <td>
        </td>
    </tr>
    <tr>
        <th>评分</th>
        <td>&nbsp;</td>
    </tr>
</script>
<script type="text/template" data-template="paper-template">
    <li>
    <span class="radiobox  ">
    <i class="icona-radio"></i>
    <input type="radio" name="" value=""
           style="display: none;">
    </span>
    </li>
</script>
<script type="text/template" data-template="paper-setoptions">

    <li>
    <span class="checkbox ">
    <i class="icona-check"></i>
    <input type="checkbox" name="" value=""
           style="display: none;">

    </span>
    </li>

</script>
<script type="text/template" data-template="paper-types">

    <div class="editset-typeitem" data-typename="">
        <p class="editset-typetit">
        </p>
        <div class="numbarbg">
            <div class="numbar" style="width: 10%;"></div>
        </div>
        <p class="numtxt"><span></span> 道</p>
        <p class="editset-del"><i class="icona-del1" onclick="paper.deleteQuestions('')"></i></p>
    </div>

</script>
<script type="text/template" data-template="paper-club">
    <div class="paper-club">
        <div class="club-summary f-cb">
            <div class="t1">分数：<strong>分</strong></div>
            <div class="w"><span class="t2">题数：<strong></strong></span></div>
            <div class="t3">难度：<strong>
                %></strong></div>
        </div>
        <div class="club-type-wrap">

            <div class="club-type-wire drag-wire" _cid="" data-typename="">
                <div class="club-type">
                    <div class="club-hd f-cb">
                        <span class="f-fl" title=""></span>
                        <div class="f-fr">
                            <a href="javascript:;" class="t-order" onclick="paper.askOrder('')">排序</a>
                            <a href="javascript:;" class="t-del" onclick="paper.deleteQuestions('')">删除</a>
                        </div>
                    </div>
                    <div class="club-grids">
                        <div class="f-cb">

                            <span class="drag-grid" _qid=""></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</script>
<script type="text/template" data-template="club-sort">
    <div class="new-side-types">
        <form>
            <div class="label">需要排序的大题</div>
            <div class="custom-checbox-g f-cb">
                <span class="custom-checkbox " title=""><i
                        class="icona-check"></i><input type="checkbox" name="type[]" value=""
                                                       style="display:none"/></span>
            </div>
            <div class="label">排序方式</div>
            <div class="custom-radio-g">
                <span class="checked custom-radio"><i class="icona-radio"></i><input type="radio" name="orderby"
                                                                                     value="1" style="display:none"
                                                                                     checked>难度从低到高排序</span>
                <span class="custom-radio"><i class="icona-radio"></i><input type="radio" name="orderby" value="-1"
                                                                             style="display:none">难度从高到低排序</span>
            </div>
        </form>
    </div>
</script>
<script type="text/template" data-template="paper-part">
    <div class="paper-part">
        <div data-paperset="6" class="paper-title">
            <h3><em class="contenteditable" data-edit="paperPart.name" data-part="">
            </em></h3>
            <span data-paperset="8" class="contenteditable" data-edit="paperPart.tip"
                  data-part=""></span>
        </div>
        <!-- paper-section -->
    </div>
</script>
<script type="text/template" data-template="paper-section">
    <div class="paper-section">
        <div data-paperset="10" class="paper-types">
            <table data-paperset="2">
                <tr>
                    <th>阅卷人</th>
                    <td></td>
                </tr>
                <tr>
                    <th>得&nbsp;&nbsp;分</th>
                    <td></td>
                </tr>
            </table>
            <p><strong><b class="t-order">
            </b>、<span class="contenteditable" data-edit="type"></span><span data-paperset="12">（共<b class="t-num"></b>题；共<b
                    class="t-score"></b>分）</span></strong></p>
            <div class="types-btngroup">
                <a class="score-btn J_MultiSetScore" href="javascript:;"><i class="icona-jiexi1"></i>批量设置得分</a>
                <a class="sort-btn J_SecSortGroup"><i class="icona-sort"></i>排序</a>
                <a class="del-btn J_DelQByType" href="javascript:;"><i class="icona-del3"></i>删除</a>
            </div>
        </div>
        <div class="paper-question-list f-usn" onselectstart="return false">
            <!-- paper-question -->
        </div>
        <div class="paper-btngroup">
            <button class="confirm">确定</button>
            <button class="cancel">取消</button>
        </div>
    </div>
</script>
<script type="text/template" data-template="paper-question">
    <div class="paper-question f-usn" onselectstart="return false" id="question-">
        <!-- question-txt -->
        <div class="question-btngroup">
            <a target="_blank" href="/question/detail/" class="jx-btn"><i class="icona-jiexi1"></i>答案解析</a>
            <a class="score-btn" href="javascript:;"><i class="icona-jiexi1"></i>设定得分</a>
            <a class="ht-btn" href="javascript:;"><i class="icona-exchange"></i>换题</a>
            <a class="zy-btn" href="javascript:;"><i class="icona-shift"></i>转移</a>
            <a class="sc-btn" href="javascript:;" onclick="OT2.QCollect(this, model.id)"><i
                    class=""></i>
            </a>
            <a class="jc-btn" href="javascript:;" onclick="OT2.ErrorReport()"><i
                    class="icona-jiucuo1"></i>纠错</a>
            <a class="del-btn" href="javascript:;"><i class="icona-del3"></i>删除</a>
        </div>
    </div>
</script>
<script type="text/template" data-template="question-txt">
    <div class="question-txt">

        <audio style="margin-bottom:10px;cursor:pointer;" controls>
            <source src=""/>
        </audio>

        <div class="question-num"><span class="q-sn"></span>. <span>（）</span> <span class="q-scoreval">（分）</span>
        </div>

        <div class="question-answer-area">
            <div class="question-s op-items">

                <span class="op-item"><span class="op-item-nut"> . </span><span
                        class="op-item-meat"></span></span>

            </div>
        </div>
        <div class="question-answer-area">
            <ul class="wan-xing-list">
                <li>
                    <em>()</em>
                    <div>
                        <p class="op-items">
                            <span class="op-item"><span class="op-item-nut">. </span><span
                                    class="op-item-meat"></span></span>

                        </p>
                    </div>
                </li>

            </ul>
        </div>
        <div class="exam-qlist"></div>
    </div>
</script>
<script type="text/template" data-template="dialog-analysis">
    <div class="paper-analysis-fixed">
        <div class="paper-analysis">
            <div class="analysis-block">
                <h3 class="analysis-tit"><span>试卷总体分布分析</span></h3>
                <table class="analysis-table">
                    <thead>
                    <tr>
                        <th colspan="3">总分：
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th rowspan="2">分值分布</th>
                        <th>客观题（占比）</th>
                        <td>（）
                        </td>
                    </tr>
                    <tr>
                        <th>主观题（占比）</th>
                        <td>（）
                        </td>
                    </tr>
                    <tr>
                        <th rowspan="2">题量分布</th>
                        <th>客观题（占比）</th>
                        <td>（）
                        </td>
                    </tr>
                    <tr>
                        <th>主观题（占比）</th>
                        <td>（）
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="f-cb">
                <div class="analysis-cell f-fl">
                    <div class="analysis-block">
                        <div class="analysis-tit"><span>试卷题量分布分析</span></div>
                        <table class="analysis-table">
                            <thead>
                            <tr>
                                <th>大题题型</th>
                                <th>题目量（占比）</th>
                                <th>分值（占比）</th>
                            </tr>
                            </thead>
                            <tbody>

                            <tr>
                                <th>
                                </th>
                                <td>（）
                                </td>
                                <td>（）
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="analysis-cell f-fr">
                    <div class="analysis-block">
                        <h3 class="analysis-tit"><span>试卷难度结构分析</span></h3>
                        <div class="analysis-chart" id="J_chart_container" style="min-height:160px; width: 360px"></div>
                    </div>
                </div>
            </div>
            <div class="analysis-block">
                <h3 class="analysis-tit"><span>试卷知识点分析</span></h3>
                <table class="analysis-table">
                    <thead>
                    <tr>
                        <th>序号</th>
                        <th>知识点（认知水平）</th>
                        <th>分值（占比）</th>
                        <th>对应题号</th>
                    </tr>
                    </thead>
                    <tbody>

                    <tr>
                        <td>
                        </td>
                        <td>
                        </td>
                        <td>（）
                        </td>
                        <td>
                        </td>
                    </tr>
                    </tbody>
                </table>


                <input type="hidden" name="" id="bigCount" value="${paperQCInfo}">


                <%--            试卷内容结束------------------------------------------------------------------------------------------------------------------------------------%>



























            </div>
        </div>
    </div>
</script>
<%--<script src="<%=request.getContextPath()%>/static/js/module/paper_edit.js"></script>--%>

<script type="text/template" data-template="errorReport">
    <div class="error-con">
        <form action="">
            <input type="hidden" name="qid" value=""/>
            <p>*请输入您遇到的错误，错误一经确认，我们会给予您一定的奖励</p>
            <textarea name="message"></textarea>
            <div class="warn"></div>
        </form>
    </div></script>
<script type="text/template" data-template="add-type">
    <div class="add-type-con">
        <p>请输入新题型名称：<span class="error-msg"></span></p>
        <input type="text" name="" value=""/>
    </div>
</script>
<script type="text/template" data-template="dialog-transfer">
    <div class="transfer-con f-usn" onselectstart="return false">
        <div class="transfer-title">
            将试题(-)转移至：
        </div>
        <div class="transfer-num">
            <ul>
                <li>
    <span class="radiobox">
    <i class="icona-radio"></i>
    <input type="radio" value="" name="type" style="display: none;">
    、
    </span>
                </li>

            </ul>
        </div>
    </div>
</script>
<script type="text/template" data-template="dialog-mulscore">
    <div class="q-scorelist-con">
        <ul>



            <li><em>：</em><input type="text" name="score" data-n="" value="0"
                                 data-ct=""/> 分 x 空
            </li>

            <li><em>：</em><span class="words">该题型暂时不支持批量设置分数，请按题设置分数</span></li>
            <li><em>：</em><input type="text" name="score" data-n="" value="0"
                                 data-ct=""/> 分 x 题
            </li>
            <li class="sum"><em>共计：</em><strong class="t-score">0</strong> 分</li>
        </ul>
    </div>
</script>
<script type="text/template" data-template="dialog-score">
    <div class="q-score-con">
        <form action="javascript:;" id="dialog-score-form">
            <p><label >：</label><input type="text" name="score" value=""
                                       data-n=""> 分 x 空</p>

            <p><label >：</label><input type="text" value="" name="score"> 分</p>

            <ul>

                <li>
                    <label></label>
                    <div><input type="text" name="score" value=""
                                data-n=""> 分 x 空
                    </div>
                    <div><input type="text" value="" name="score"/> 分</div>
                    <div><input type="text" name="score" value=""
                                data-n=""> 分 x 空
                    </div>

                </li>
                <li>
                    <div>
                        ：
                        <input type="text" name="score" value=""
                               data-n=""> 分 x 空
                    </div>
                </li>
            </ul>
            <p>共计：<span class="s-total">0</span> 分</p>
        </form>
    </div>
</script>
<script type="text/template" data-template="dialog-answer-sheet">
    <div class="answersheet-con">
        <div class="sheet-line f-cb">
            <label>答题卡样式：</label>
            <div class="menu sheet-section active">
                <span class="s-title">普通表格型</span><i class="icona-tri"></i>
                <ul class="sheet-list">
                    <li data-sheet="1">普通表格型</li>
                    <li data-sheet="2">标准题卡型</li>
                    <li data-sheet="3">选择密集型</li>
                </ul>
            </div>
        </div>
        <div class="sheet">
            <div><img src="/images/putong.png"></div>
            <div style="display: none;"><img src="/images/biaozhun.png"></div>
            <div style="display: none;"><img src="/images/miji.png"></div>
        </div>
    </div>
</script>
<script type="text/template" data-template="dialog-save">
    <div class="prompt-con">
        <p>试卷保存成功，您还可以进行以下操作：</p>
        <div>
            <button id="b-download">下载组卷</button>
            <a id="b-test" class="btn" href="/paper/test?pid=">开始测试</a>
            <button id="b-share">共享组卷</button>
            <a id="b-view" class="btn" href="/ucenter/u-zujuan" target="_blank">查看记录</a>
        </div>
    </div>
</script>
<script type="text/template" data-template="dialog-download">
    <div class=" download-msg">
        <div class="download-size">
            <div class="download-text" style="height: 120px;">
                纸张大小：
            </div>
            <div class="size-con">
                <div class="size-a4 radiobox checked">
                <span>
                    <i class="icona-radio"></i>
                    <input type="radio" value="A4" name="chooseSize" checked style="display: none;">
                </span>
                    <i class="icona-a4"></i>
                    <p>A4</p>
                </div>
                <div class="size-a3 radiobox">
                <span>
                    <i class="icona-radio"></i>
                    <input type="radio" value="A3" name="chooseSize" style="display: none;">
                </span>
                    <i class="icona-a3"></i>
                    <p>A3（双栏）</p>
                </div>
            </div>
            <div class="size-con">
                <div class="size-a4 radiobox">
                <span>
                    <i class="icona-radio"></i>
                    <input type="radio" value="B5" name="chooseSize" style="display: none;">
                </span>
                    <i class="icona-a4"></i>
                    <p>B5</p>
                </div>
                <div class="size-a3 radiobox">
                <span>
                    <i class="icona-radio"></i>
                    <input type="radio" value="B4" name="chooseSize" style="display: none;">
                </span>
                    <i class="icona-a3"></i>
                    <p>B4（双栏）</p>
                </div>
            </div>
        </div>
        <div class="download-type">
            <div class="download-text">
                试卷类型：
            </div>
            <div class="download-type-con">
                <div>
                <span class="radiobox">
                    <i class="icona-radio"></i>
                    <input type="radio" value="teacher" name="chooseType" style="display: none;">
                    教师用卷（答案在题后）
                </span>
                    <label></label>
                </div>
                <div>
                <span class="radiobox checked">
                    <i class="icona-radio"></i>
                    <input type="radio" value="student" name="chooseType" checked style="display: none;">
                    学生用卷（答案在卷尾）
                </span>
                    <label></label>
                </div>
            </div>
        </div>
        <div class="download-hint">
            <div class="download-text">
                扣费提示：
            </div>
            <div class="hint-con">
                <p>此次下载需扣除您所属的单位账户额度1份</p>
                <p>您所属的单位账户下载受限</p>
                <p>系统提示：
                    <div class="hint-con">
                <p>您已下载过这份试卷,15天内再次下载免费</p>
            </div>

            <div class="hint-con">

                <p>您为vip用户，此次下载<b class="highlight">免费</b></p>
                <p>剩余下载次数:<b class="highlight">
                </b>到期时间:<b class="highlight">
                </b></p>
                <p>您当前剩余：<b>
                </b>个学币，<b>
                </b>个普通点</p>
                <p>本次下载含普通试题<b>
                </b>个，精品试题<b>
                </b>个</p>
                <p>此次下载需扣除普通点：
                    <b class="highlight">
                    </b>个
                    或学币<b class="highlight">
                    </b>个
                </p>
            </div>
            <p></p>
            <div class="hint-msg">
                <div class="hint-tit">
                    温馨提示：
                </div>
                <div class="hint-text">
                    <p>1、组卷通用户下载免费。 <a href="/help/zujuan" target="blank" style="color:#17A3E0;">学校/培训机构申请免费试用</a></p>
                    <p>2、VIP用户下载免费。 <a href="/payment/vip" target="blank" style="color:#17A3E0;">开通VIP</a></p>
                    <p>3、如有问题，请联系客服QQ：81321902 </p>
                </div>
            </div>
        </div>
    </div></script>
<script type="text/template" data-template="dialog-share">
    <div class=" download-msg">
        <style type="text/css">

            .mytest-data select {
                margin-left: 10px;
            }

            .mytest-data td {
                text-align: left
            }

            .mytest-data select {
                width: 140px;
                padding: 2px 0;
            }
            .mytest-data input {
                margin-left: 10px;
                padding: 2px 4px;
            }
        </style>

        <form id='share-form'>
            <input type="hidden" name="pid" value=""/>
            <table width="100%" class="mytest-data" id="sharedata">
                <tbody>
                <tr>
                    <td height="40" colspan="2">
                        试卷名称:<input type="text" class="papers" value="" name="title"
                                    style="width:300px; color:#9a9a9a">
                    </td>
                </tr>
                <tr>
                    <td>
                        地区:<select class="papers" name="province">
                        <option value="0">全国</option>
                        <option value="1">北京市</option>
                        <option value="2">天津市</option>
                        <option value="3">河北省</option>
                        <option value="4">山西省</option>
                        <option value="5">内蒙古自治区</option>
                        <option value="6">辽宁省</option>
                        <option value="7">吉林省</option>
                        <option value="8">黑龙江省</option>
                        <option value="9">上海市</option>
                        <option value="10">江苏省</option>
                        <option value="11">浙江省</option>
                        <option value="12">安徽省</option>
                        <option value="13">福建省</option>
                        <option value="14">江西省</option>
                        <option value="15">山东省</option>
                        <option value="16">河南省</option>
                        <option value="17">湖北省</option>
                        <option value="18">湖南省</option>
                        <option value="19">广东省</option>
                        <option value="20">广西壮族自治区</option>
                        <option value="21">海南省</option>
                        <option value="22">重庆市</option>
                        <option value="23">四川省</option>
                        <option value="24">贵州省</option>
                        <option value="25">云南省</option>
                        <option value="26">西藏自治区</option>
                        <option value="27">陕西省</option>
                        <option value="28">甘肃省</option>
                        <option value="29">青海省</option>
                        <option value="30">宁夏回族自治区</option>
                        <option value="31">新疆维吾尔自治区</option>
                    </select>
                    </td>

                </tr>
                <tr>
                    <td>
                        年级学期:<select class="papers" name="gradeid">

                        <option value="">
                        </option>
                    </select>
                    </td>
                    <td>
                        类型:<select class="papers" name="papertype">
                        <option value="">
                        </option>
                    </select>
                    </td>
                </tr>
                </tbody>
            </table>
        </form>
        注：共享试卷成功后，其他用户也可以看到您的组卷哦。同时，您也会得到一定的<label style="color:#FF9136;">积分</label>作为奖励。
    </div>
</script>
<script type="text/template" data-template="replace-question">

    <div class="shade-bg"></div>
    <div class="p-replace-wrap">
        <!-- <div class="p-head">
            <h2 class="p-tit">替换试题</h2>
            <sapn class="p-close">X</sapn>
        </div> -->
        <div class="p-body">
            <div class="p-con-hd f-cb">
                <ul class="p-con-num f-cb">
                    <li><a href="javascript:;" class="active">
                    </a></li>
                </ul>
                <a href="javascript:;" class="change-btn">换一批</a>
            </div>
            <div class="p-con-bd">
                <div class="p-content">
                </div>
                <div class="loading1"><img src="/images/loading1.gif"></div>
                <div class="p-q-ft">
                    <a href="javascript:;" class="replace-btn" index="0">替换</a>
                    <a href="javascript:;" class="p-close">关闭</a>
                </div>
            </div>
        </div>
    </div>
</script>

<script>
    $('.replace_anawer').css('display', 'block');
    $('input.cke_questions_blankInput').each(function () {
        $(this).replaceWith('<span class="q-blank">&nbsp;</span>');
    });
    OT2.Util.calcItemWidth($('.exam-s').first());
    var hd = $('.p-con-num li a');
    var bd = $('.p-content ul li');
    // var htm = '<div>试题内容区域</div>'
    hd.click(function () {
        hd.removeClass('active');
        $(this).addClass("active");
        var index = hd.index(this);
        $('.replace-btn').attr('index', index);
        bd.hide().eq(index).show();
//         setTimeout(function() {
        bd.eq(index).find('.exam-s').each(function () {
            OT2.Util.calcItemWidth($(this));
        });
//         }, 100);

        return false;
    });
    $('.search-exam').click(function () {
        var answer = $(this).parents('.beauty-man').find('.replace_anawer');
        answer.each(function () {
            if ($(this).css('display') == 'none') {
                $(this).show();
            } else {
                $(this).hide();
            }
        })
    });
    $('.p-close').click(function () {
        $('.shade-bg').remove();
        $('.p-replace-wrap').removeClass('mactive');
        setTimeout(function () {
            $('.p-replace-wrap').remove();
        }, 100);
        $(document.body).css({"overflow-y": "auto"});
    })
</script>

<script type="text/template" data-template="detail-txt">
    <div class="exam-con">
        <audio style="margin-bottom:10px;cursor:pointer;" controls>
            <source src=""/>
        </audio>
        <div class="analyticbox">
            <div class="subexam-head"><span>（）</span>
            </div>
            <div class="exam-s">
                <span class="op-item"><span class="op-item-nut"> . </span><span
                        class="op-item-meat"></span></span>

            </div>
            <div class="exam-s">
                <span class="op-item"><span class="op-item-nut"> . </span><span
                        class="op-item-meat"></span></span>
            </div>
        </div>
        <div class="exam-q">
        </div>
        <div class="exam-s">
            <span class="op-item"><span class="op-item-nut">. </span><span class="op-item-meat"></span></span>

        </div>
        <div class="f-cb">
            <div class="exam-mynum">（）
            </div>
            <div class="w">
                <div class="exam-s exam-sw">
                    <span class="op-item"><span class="op-item-nut"> . </span><span
                            class="op-item-meat"></span></span>
                </div>
            </div>
        </div>
        <div class="exam-qlist"></div>
    </div></script>
<script type="text/template" data-template="question-item">
    <ul>
        <li class="beauty-man visible-ake" data-qid="" style="display:none">
            <div class="search-exam dj-search-exam">
                <div class="exam-head">
                    <p class="exam-head-left">
                        <span>题型：</span><i class="line"></i>
                        <span>题类：</span><i class="line"></i>
                        <span>难易度：</span><i class="line"></i>
                    </p>
                </div>
                <div class="exam-con">
                    <div class="analyticbox">
                        <div class="subexam-head"><span>（）、</span>
                        </div>
                        <div class="exam-s">
                            <span class="op-item"><span class="op-item-nut">、</span><span
                                    class="op-item-meat"></span></span>
                        </div>
                        <div class="exam-s">
                            <span class="op-item"><span class="op-item-nut">、</span><span
                                    class="op-item-meat"></span></span>
                        </div>
                    </div>
                    <div class="exam-q">
                    </div>
                    <div class="exam-s">
                        <span class="op-item"><span class="op-item-nut">、</span><span
                                class="op-item-meat"></span></span>
                    </div>
                    <div class="f-cb">
                        <div class="exam-mynum">（）
                        </div>
                        <div class="w">
                            <div class="exam-s exam-sw">
                                <span class="op-item"><span class="op-item-nut">、</span><span
                                        class="op-item-meat"></span></span>
                            </div>
                        </div>
                    </div>
                    <div class="exam-qlist">
                    </div>
                </div>
                <div class="analyticbox-brick analyticbox-brick-normal replace_anawer">
                    <div class="analyticbox">
                        <span class="exam-point">【考点】</span>
                        <div class="analyticbox-body">
                            <img src='' style="vertical-align: middle;"/>
                        </div>
                    </div>
                    <div class="analyticbox">
                        <span class="exam-answer">【答案】</span>
                        <div class="analyticbox-body">
                            <img src='' style="vertical-align: middle;"/>
                        </div>
                    </div>
                    <div class="analyticbox analyticbox1">
                        <span class="exam-analytic">【解析】</span>
                        <div class="analyticbox-body">
                            <img src='' style="vertical-align: middle;"/>&nbsp;&nbsp;
                        </div>
                    </div>
                    <div class="analyticbox-tips"></div>
                    <div class="analyticbox-tips">抱歉，您未登录！暂时无法查看解析，<a href="/login"
                                                                      onclick="OT2.Global.initLogin(); return false;">点击登录</a>
                    </div>
                </div>
            </div>

        </li>
    </ul>
</script>
<script type="text/x-template-underscore" data-template="exam-point">
    <div class="analyticbox">
        <span class="exam-point">【考点】</span>
        <div class="analyticbox-body">
            <img src='' style="vertical-align: middle;"/>
        </div>
    </div>
</script>
<script type="text/x-template-underscore" data-template="exam-answer">

    <div class="analyticbox replace_anawer">
        <span class="exam-answer">【答案】</span>
        <div class="analyticbox-body">
            <img src='' style="vertical-align: middle;"/>
        </div>
    </div>
</script>
<script type="text/x-template-underscore" data-template="exam-explanation">
    <div class="analyticbox analyticbox1">
        <span class="exam-analytic">【解析】</span>
        <div class="analyticbox-body">
            <img src='' style="vertical-align: middle;"/>&nbsp;&nbsp;
        </div>
    </div>
    <div class="analyticbox-tips">抱歉，在当前页面查看解析的功能仅限于“组卷通”用户！<a href="/help/request" target="_blank">用户升级</a></div>
    <div class="analyticbox-tips">抱歉，您未登录！暂时无法查看答案与解析，<a href="/login" onclick="OT2.Global.initLogin(); return false;">点击登录</a>
    </div>
</script>
<script src="<%=request.getContextPath()%>/static/js/extends/element.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/highcharts.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/error-report.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/paper.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/paper-part.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/paper-section.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/question-txt.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/paper-question.min.js"></script>

<script type="text/javascript" src="http://www.xdocin.com/xdoc.js"></script>
<script type="text/javascript" src="http://www.xdocin.com/baiduTemplate.js"></script>



<div style="display: none" id="schtml">





    <%--  试卷内容开始-----------------------------------------------------------------------------------------------------------------------------------------%>
    <table style="border: 0px">
        <tbody>
        <tr>
            <%--          <td data-paperset="1" class="editcon-silder" style="display: table-cell;"></td>--%>
            <td>
                <div class="editcon">
                    <div class="test-title">
                        <h1 data-paperset="3">
                            <span class="contenteditable" data-edit="title" id="paper-title1">
                            <%
                                Date date1 = new Date();
                                pageContext.setAttribute("d", date1);
                            %>
                            <fmt:formatDate value="${d}" type="date" dateStyle="long"/>
                                ${questionBasketInfo.gradeName}${questionBasketInfo.courseName}试卷</span>
                        </h1>
                        <h2 data-paperset="5" style="display: block;"><span data-edit="subtitle"
                                                                            class="contenteditable">${questionBasketInfo.courseName}考试</span></h2>
                    </div>
                    <div data-paperset="7" class="test-time" style="display: block;">
                        <p><span>考试时间：<i class="contenteditable" data-edit="examtime">${paperResponsePojo.totalTime}</i> 分钟</span><span>满分：<i
                                class="contenteditable" data-edit="score">${paperResponsePojo.totalScore}</i> 分</span></p>
                    </div>
                    <ul data-paperset="9" class="stu-info" style="display: block;">
                        姓名：<span>____________</span> 班级：<span>____________</span>
                        学号：<span>____________</span>

                    </ul>
                    <br>
                    <div data-paperset="11" class="mark-table" style="display: block;">
                        <table id="J_PaperScore1" >
                            <tbody>
                            <tr id="J_PaperScore011">
                                <th>题号</th>

                            </tr>
                            <tr id="J_PaperScore021">
                                <th>评分</th>

                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <br>
                    <div data-paperset="4" class="rule" style="display: block;">
                        <p>* 注意事项：</p>
                        <div class="contenteditable" data-edit="notes">1、填写答题卡的内容用2B铅笔填写<br>2、提前 5 分钟收取答题卡
                        </div>
                    </div>
                    <div id="J_PaperBody1">
                        <%-------------------------------------------------------------------------------------------------------------------------------------------%>
                        <%
                            int countNum1 = 1;
                            pageContext.setAttribute("countNum1", countNum1);
                        %>
                        <c:forEach items="${paperQCInfo}" var="paperQC1">
                            <div class="paper-part">
                                <div class="paper-section" _cid="type_1">
                                    <p style="height: 40px;display: inline-block;"><strong><b class="t-order">${paperQC1.typeNumName}</b>、<span class="contenteditable"
                                                                                                                                               data-edit="type">${paperQC1.questionTypeName}</span><span
                                            data-paperset="12">（共<b class="t-num">${paperQC1.questionCount}</b>题；共<b
                                            class="t-score">${paperQC1.questionTypeScore}</b>分；共<b
                                            class="t-score">${paperQC1.questionTypeTime}</b>分钟）</span></strong></p>
                                    <div data-paperset="5" class="paper-types" style="display: inline-block;padding: 0;margin: 0;float: left">
                                        <table  style="width: 100px;height: 20px;">
                                            <tbody>
                                            <tr>
                                                <th>阅卷人</th>
                                                <td>&nbsp;</td>
                                            </tr>
                                            <tr>
                                                <th>得&nbsp;&nbsp;分</th>
                                                <td>&nbsp;</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="paper-question-list f-usn" onselectstart="return false">
                                        <!-- paper-question -->
                                        <c:forEach items="${paperQC1.questionResponsePojos}" var="question1" varStatus="questionIndex1">
                                            <div class="paper-question f-usn" onselectstart="return false"
                                                 id="question-${question1.questionId}">
                                                <div class="question-txt">
                                                    <div class="question-num"><span class="q-sn"><c:out value="${countNum1+questionIndex1.index}"></c:out></span>. <span
                                                            class="q-scoreval">（${question1.questionScore}分）</span>${question1.questionContent}
                                                    </div>
                                                    <div class="question-answer-area">
                                                        <div class="question-s op-items">
                                                            <c:if test="${question1.questionType==101}">
                                                                <div class="exam-s">
                            <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                <span class="op-item-nut" style="margin-top: 4px;">A . </span>
                                <span class="op-item-meat" style="margin-top: 4px;">
                                        ${question1.selectionA}
                                </span>
                            </span>
                                                                    <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                 <span class="op-item-nut" style="margin-top: 4px;">B . </span>
                                 <span class="op-item-meat" style="margin-top: 4px;">
                                         ${question1.selectionB}
                                 </span>
                             </span>
                                                                    <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                  <span class="op-item-nut" style="margin-top: 4px;">C . </span>
                                  <span class="op-item-meat" style="margin-top: 4px;">
                                          ${question1.selectionC}
                                  </span>
                              </span>
                                                                    <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                   <span class="op-item-nut" style="margin-top: 4px;">D . </span>
                                   <span class="op-item-meat" style="margin-top: 4px;">
                                           ${question1.selectionD}
                                   </span>
                               </span>
                                                                </div>
                                                            </c:if>
                                                            <c:if test="${question1.questionType==102}">
                                                                <div class="exam-s">
                                    <span class="op-item" style="width: 200px; margin-right: 0px; height: 32px; clear: none;">
                                ✔ 对
                            </span>
                                                                    <span class="op-item" style="width: 200px; margin-right: 0px; height: 32px; clear: none;">
                                ✘ 错
                            </span>
                                                                </div>
                                                            </c:if>
                                                        </div>
                                                    </div>


                                                </div>
                                            </div>
                                        </c:forEach>
                                        <c:set var="countNum1" value="${countNum1+paperQC1.questionCount}"></c:set>
                                    </div>
                                    <div class="paper-btngroup">
                                        <button class="confirm">确定</button>
                                        <button class="cancel">取消</button>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </td>
        </tr>
        </tbody>
    </table>

</div>



<script>
    var localObj = window.location;
    var server_context = localObj.protocol+"//"+localObj.host+"/"+localObj.pathname.split("/")[1];
    $(document).ready(function(){
        var bigCount = ${paperQCInfo.size()};
        for(var i=0;i<bigCount;i++){
            var a = i+1;
            $("#J_PaperScore01").append("<td>"+translateNum(a)+"</td>");
            $("#J_PaperScore02").append("<td>&nbsp;</td>");
            $("#J_PaperScore011").append("<td>"+translateNum(a)+"</td>");
            $("#J_PaperScore021").append("<td>&nbsp;</td>");
        }
        // TODO 优化数字转化
        function translateNum(a){
            var arr = new Array(13)
            arr[0] = "零";arr[1] = "一";arr[2] = "二";arr[3] = "三";arr[4] = "四";arr[5] = "五";
            arr[6] = "六";arr[7] = "七";arr[8] = "八";arr[9] = "九";arr[10] = "十";arr[11] = "十一";arr[12] = "十二";
            return arr[a];
        }
    });

    function paper_download(){
        var schtml = $("#schtml").html();
        $.ajax({
            url: server_context + '/paper/download.do',
            type: 'POST', //GET
            async: true,    //或false,是否异步
            data: {
                schtml: schtml
            },
            timeout: 5000,    //超时时间
            dataType: 'json',    //返回的数据格式：json/xml/html/script/jsonp/text
            success: function (data, textStatus, jqXHR) {
                var jsonResult = data;
                var das = jsonResult.code;
                layer.closeAll('loading');
                if("X01"==jsonResult.code){
                    if($(favChange).hasClass("icona-shoucang")){
                        $(obj).html("<i class=\"icona-quxiaosc\"></i>取消收藏");
                    }else{
                        $(obj).html("<i class=\"icona-shoucang\"></i>收藏");
                    }
                }
                else if("X03"==jsonResult.code){
                    window.localObj.href = server_context+ "/index.do?tips=e01";
                }
                else{
                    layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                }

            },
            error: function (xhr, textStatus) {
                layer.closeAll('loading');
                layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
            }
        });
    }



</script>
<script src="<%=request.getContextPath()%>/static/js/extends/global.min.js"></script>
<a class="return" href="javascript:;" style="right: -52.5px; display: none;"><i class="icona-top"></i></a>
<script src="<%=request.getContextPath()%>/static/js/extends/yii.js"></script>
<script src="<%=request.getContextPath()%>/static/js/lib/layer.js"></script>

</body>
</html>