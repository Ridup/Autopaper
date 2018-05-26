(function(){var c={r:function(a){if(c[a].inited)return c[a].value;if("function"===typeof c[a].value){var b={exports:{}},e=c[a].value(null,b.exports,b);c[a].inited=!0;c[a].value=e;if(void 0!==e)return e;for(var h in b.exports)if(b.exports.hasOwnProperty(h))return c[a].inited=!0,c[a].value=b.exports}else return c[a].inited=!0,c[a].value},"0":{value:function(){function a(a){this.formula=a}function b(a,d,j,f,i){var n=null,o=null,o=[],p=d.operand||[],n=null;j.operand=[];if(d.name&&-1===d.name.indexOf("text")){for(var l=
0,s=p.length;l<s;l++)if(n=p[l],n===k){if(o.push(l),i.hasOwnProperty("startOffset")||(i.startOffset=l),i.endOffset=l,d.attr&&d.attr.id)i.groupId=d.attr.id}else n?"string"===typeof n?(p[l]="brackets"===d.name&&2>l?n:"function"===d.name&&0===l?n:e("text",n),j.operand.push(p[l])):(j.operand.push({}),p[l]=b(a.operand[l],n,j.operand[j.operand.length-1],f,i)):(p[l]=e("empty"),j.operand.push(p[l]));2===o.length&&(i.endOffset-=1);for(;l=o.length;)l=o[l-1],p.splice(l,1),o.length--,a.operand.splice(l,1)}n=c(d.name);
if(!n)throw Error("operator type error: not found "+d.name);i=function(){};i.prototype=n.prototype;o=new i;n.apply(o,p);j.func=o;for(var q in d.callFn)d.callFn.hasOwnProperty(q)&&o[q]&&o[q].apply(o,d.callFn[q]);d.attr&&(d.attr.id&&(f[d.attr.id]={objGroup:o,strGroup:a}),d.attr["data-root"]&&(f.root={objGroup:o,strGroup:a}),o.setAttr(d.attr));return o}function e(a,b){switch(a){case "empty":return new kf.EmptyExpression;case "text":return new kf.TextExpression(b)}}function c(a){return f[a]||kf[a.replace(/^[a-z]/i,
function(a){return a.toUpperCase()}).replace(/-([a-z])/gi,function(a,b){return b.toUpperCase()})+"Expression"]}function d(a){var b={};if("[object Array]"==={}.toString.call(a))for(var b=[],e=0,c=a.length;e<c;e++)b[e]=!a[e]||"object"!==typeof a[e]?a[e]:d(a[e]);else for(e in a)a.hasOwnProperty(e)&&(b[e]=!a[e]||"object"!==typeof a[e]?a[e]:d(a[e]));return b}var f={},k="";a.prototype.generateBy=function(a){var a=a.tree,e={},c={},h={};if("string"===typeof a)throw Error("Unhandled error");this.formula.appendExpression(b(a,
d(a),e,h,c));return{select:c,parsedTree:a,tree:e,mapping:h}};a.prototype.regenerateBy=function(a){this.formula.clearExpressions();return this.generateBy(a)};return a}},1:{value:function(){return{toRPNExpression:c.r(2),generateTree:c.r(3)}}},2:{value:function(){function a(e){for(var c=[],d=null,d=[],f=null;void 0!==(f=e.pop());)f&&"object"===typeof f&&(!1===f.sign||"function"===f.name)?(f=f.handler(f,[],d.reverse()),d.unshift(f),d.reverse()):d.push(f);for(e=d.reverse();d=e.shift();)"combination"===
d.name&&(1===d.operand.length&&"brackets"===d.operand[0].name)&&(d=d.operand[0]),b.isArray(d)?c.push(a(d)):c.push(d);return c}var b=c.r(4);return a}},3:{value:function(){function a(c){for(var d=null,f=[],d=0,k=c.length;d<k;d++)e.isArray(c[d])&&(c[d]=a(c[d]));for(;d=c.shift();)"object"===typeof d&&d.handler?f.push(d.handler(d,f,c)):f.push(d);return b(f)}var b=c.r(15),e=c.r(4);return a}},4:{value:function(){var a=c.r(7),b=c.r(6),e=c.r(18),h={getLatexType:function(d){d=d.replace(/^\\/,"");return a[d]?
"operator":b[d]?"function":"text"},isArray:function(a){return a&&"[object Array]"===Object.prototype.toString.call(a)},getDefine:function(b){return h.extend({},a[b.replace("\\","")])},getFuncDefine:function(a){return{name:"function",params:a.replace(/^\\/,""),handler:e}},getCasesDefine:function(b){return h.extend({params:b},a.cases)},getMatrixDefine:function(b,e,c){return h.extend({colCount:b,rowCount:e},a[c])},getSplitDefine:function(b){return h.extend({params:b},a.split)},getBracketsDefine:function(b,
e){return h.extend({params:[b,e]},a.brackets)},extend:function(a,b){for(var e in b)b.hasOwnProperty(e)&&(a[e]=b[e]);return a}};return h}},5:{value:function(){return{".":!0,"{":!0,"}":!0,"[":!0,"]":!0,"(":!0,")":!0,"|":!0,".":!0,"\\langle":!0,"\\rangle":!0,"\\lfloor":!0,"\\rfloor":!0,"\\lceil":!0,"\\rceil":!0}}},6:{value:function(){return{sin:1,cos:1,arccos:1,cosh:1,det:1,inf:1,limsup:1,Pr:1,tan:1,arcsin:1,cot:1,dim:1,ker:1,ln:1,sec:1,tanh:1,arctan:1,coth:1,exp:1,lg:1,log:1,arg:1,csc:1,gcd:1,lim:1,
max:1,sinh:1,deg:1,hom:1,liminf:1,min:1,sup:1}}},7:{value:function(){var a=c.r(32),b=c.r(11);return{"^":{name:"superscript",type:b.OP,handler:a},_:{name:"subscript",type:b.OP,handler:a},frac:{name:"fraction",type:b.FN,sign:!1,handler:c.r(17)},dfrac:{name:"fraction",type:b.FN,sign:!1,handler:c.r(16)},sqrt:{name:"radical",type:b.FN,sign:!1,handler:c.r(34)},sum:{name:"summation",type:b.FN,traversal:"rtl",handler:c.r(35)},"int":{name:"integration",type:b.FN,traversal:"rtl",handler:c.r(20)},brackets:{name:"brackets",
type:b.FN,handler:c.r(13)},cases:{name:"cases",type:b.FN,handler:c.r(14)},split:{name:"split",type:b.FN,handler:c.r(33)},mathcal:{name:"mathcal",type:b.FN,sign:!1,handler:c.r(24)},overparen:{name:"overparen",type:b.FN,sign:!1,handler:c.r(29)},underbrace:{name:"underbrace",type:b.FN,handler:c.r(37)},mathfrak:{name:"mathfrak",type:b.FN,sign:!1,handler:c.r(25)},mathbf:{name:"mathbf",type:b.FN,sign:!1,handler:c.r(23)},mathbb:{name:"mathbb",type:b.FN,sign:!1,handler:c.r(22)},mathrm:{name:"mathrm",type:b.FN,
sign:!1,handler:c.r(26)},hat:{name:"hat",type:b.FN,sign:!1,handler:c.r(19)},vec:{name:"vec",type:b.FN,sign:!1,handler:c.r(19)},overrightarrow:{name:"overrightarrow",type:b.FN,sign:!1,handler:c.r(19)},widehat:{name:"widehat",type:b.FN,sign:!1,handler:c.r(19)},vmatrix:{name:"vmatrix",type:b.FN,sign:!1,handler:c.r(27)},pmatrix:{name:"pmatrix",type:b.FN,sign:!1,handler:c.r(27)},textcircled:{name:"textcircled",type:b.FN,sign:!1,handler:c.r(36)},prod:{name:"product",type:b.FN,sign:!1,handler:c.r(31)},pmod:{name:"pmod",
type:b.FN,sign:!1,handler:c.r(30)},overline:{name:"overline",type:b.FN,sign:!1,handler:c.r(28)}}}},8:{value:function(){return{"int":c.r(39),quot:c.r(40)}}},9:{value:function(){return{combination:c.r(43),fraction:c.r(44),dfraction:c.r(44),"function":c.r(45),integration:c.r(47),subscript:c.r(61),superscript:c.r(63),script:c.r(58),radical:c.r(60),summation:c.r(62),product:c.r(57),brackets:c.r(41),mathcal:c.r(50),mathfrak:c.r(51),mathbb:c.r(48),mathrm:c.r(52),mathbf:c.r(49),cases:c.r(42),split:c.r(59),
textcircled:c.r(64),hat:c.r(46),pmod:c.r(56),overline:c.r(54),underbrace:c.r(65),overparen:c.r(55),matrix:c.r(53)}}},10:{value:function(){return{"#":1,$:1,"%":1,_:1,"&":1,"{":1,"}":1,"^":1,"~":1}}},11:{value:function(){return{OP:1,FN:2}}},12:{value:function(){return function(a,b,e){a.operand=[];for(var b=0,c=a.colCount*a.rowCount;b<c;b++)a.operand[b]=e.shift();a.callFn={setColNum:[a.colCount]};delete a.handler;delete a.colCount;delete a.rowCount;return a}}},13:{value:function(){var a=c.r(5);return function(b,
e,c){for(var e=0,d=b.params.length;e<d;e++){if(!(b.params[e]in a))throw Error("Brackets: invalid params");1<b.params[e].length&&(b.params[e]+="\\")}b.operand=b.params;b.params[2]=c.shift();delete b.handler;delete b.params;return b}}},14:{value:function(){return function(a,b,e){b=a.params;a.operand=[];for(var c=0;c<b;c++)a.operand.push(e.shift());delete a.handler;delete a.params;return a}}},15:{value:function(){return function(a){return{name:"combination",operand:a||[]}}}},16:{value:function(){return function(a,
b,e){var c=e.shift(),d=e.shift();if(void 0===c||void 0===d)throw Error("Frac: Syntax Error");c.handler&&"integration"===c.name?(c=c.handler(c,b,[d]),d=e.shift()):d.handler&&"integration"===d.name&&(d=d.handler(d,b,[e.shift()]));a.operand=[c,d];a.callFn={setZoom:[1]};delete a.handler;return a}}},17:{value:function(){return function(a,b,e){var c=e.shift(),d=e.shift();if(void 0===c||void 0===d)throw Error("Frac: Syntax Error");c.handler&&"integration"===c.name?(c=c.handler(c,b,[d]),d=e.shift()):d.handler&&
"integration"===d.name&&(d=d.handler(d,b,[e.shift()]));a.operand=[c,d];delete a.handler;return a}}},18:{value:function(){var a=c.r(21);return function(b,e,c){var d=a.exec(c);d.expr&&(d.expr.handler&&"integration"===d.expr.name)&&(d.expr=d.expr.handler(d.expr,e,[c.shift()]));b.operand=[b.params,d.expr,d.superscript,d.subscript];delete b.params;delete b.handler;return b}}},19:{value:function(){return function(a,b,e){b=e.shift();e=a.name;a.name="hat";a.operand=[b];a.callFn={setType:[e]};delete a.handler;
return a}}},20:{value:function(){var a=c.r(21),b=c.r(11).FN;return function(e,c,d){var f=d.shift(),k=a.exec(d);k.expr&&(k.expr.type===b&&k.expr.handler&&"integration"===k.expr.name)&&(k.expr=k.expr.handler(k.expr,c,[d.shift()]));e.operand=[k.expr,k.superscript,k.subscript];e.callFn={setType:[f|0]};delete e.handler;return e}}},21:{value:function(){function a(a){var e=a.shift();if(!e)return null;if("subscript"===e.name||"superscript"===e.name)return{type:e.name,value:a.shift()};a.unshift(e);return null}
return{exec:function(b){var e=a(b),c=null,d={superscript:null,subscript:null};if(e&&(c=a(b),d[e.type]=e.value||null,c)){if(c.type===e.type)throw Error("Script: syntax error!");d[c.type]=c.value||null}if((b=b.shift())&&b.name&&-1!==b.name.indexOf("script"))throw Error("Script: syntax error!");d.expr=b||null;return d}}}},22:{value:function(){return function(a,b,e){b=e.shift();"object"===typeof b&&"combination"===b.name&&(b=b.operand.join(""));a.name="text";a.attr={_reverse:"mathbb"};a.callFn={setFamily:["KF AMS BB"]};
a.operand=[b];delete a.handler;return a}}},23:{value:function(){return function(a,b,e){b=e.shift();"object"===typeof b&&"combination"===b.name&&(b=b.operand.join(""));a.name="text";a.attr={_reverse:"mathbf"};a.callFn={setFamily:["KF AMS BOLD"]};a.operand=[b];delete a.handler;return a}}},24:{value:function(){return function(a,b,e){b=e.shift();"object"===typeof b&&"combination"===b.name&&(b=b.operand.join(""));a.name="text";a.attr={_reverse:"mathcal"};a.callFn={setFamily:["KF AMS CAL"]};a.operand=[b];
delete a.handler;return a}}},25:{value:function(){return function(a,b,e){b=e.shift();"object"===typeof b&&"combination"===b.name&&(b=b.operand.join(""));a.name="text";a.attr={_reverse:"mathfrak"};a.callFn={setFamily:["KF AMS FRAK"]};a.operand=[b];delete a.handler;return a}}},26:{value:function(){return function(a,b,e){b=e.shift();"object"===typeof b&&"combination"===b.name&&(b=b.operand.join(""));a.name="text";a.attr={_reverse:"mathrm"};a.callFn={setFamily:["KF AMS ROMAN"]};a.operand=[b];delete a.handler;
return a}}},27:{value:function(){return function(a,b,e){b=a.name.charAt(0);a.operand=[];for(var c=0,d=a.colCount*a.rowCount;c<d;c++)a.operand[c]=e.shift();a.callFn={setColNum:[a.colCount],setType:[b]};a.name="matrix";delete a.handler;delete a.colCount;delete a.rowCount;return a}}},28:{value:function(){return function(a,b,e){b=e.shift();a.operand=[b];delete a.handler;return a}}},29:{value:function(){return function(a,b,e){b=e.shift();a.operand=[b];delete a.handler;return a}}},30:{value:function(){return function(a,
b,e){b=e.shift();a.operand=[b];delete a.handler;return a}}},31:{value:function(){var a=c.r(21),b=c.r(11).FN;return function(e,c,d){var f=a.exec(d);f.expr&&(f.expr.type===b&&f.expr.handler&&"integration"===f.expr.name)&&(f.expr=f.expr.handler(f.expr,c,[d.shift()]));e.operand=[f.expr,f.superscript,f.subscript];delete e.handler;return e}}},32:{value:function(){return function(a,b,e){b=b.pop();e=e.shift()||null;if(!e)throw Error("Missing script");b=b||"";if(b.name===a.name||"script"===b.name)throw Error("script error");
if("subscript"===b.name)return b.name="script",b.operand[2]=b.operand[1],b.operand[1]=e,b;if("superscript"===b.name)return b.name="script",b.operand[2]=e,b;a.operand=[b,e];delete a.handler;return a}}},33:{value:function(){return function(a,b,e){b=a.params;a.operand=[];for(var c=0;c<b;c++)a.operand.push(e.shift());delete a.handler;delete a.params;return a}}},34:{value:function(){var a=c.r(15);return function(b,c,h){var c=h.shift(),d=null,d=null;if("["===c){for(c=[];(d=h.shift())&&"]"!==d;)c.push(d);
c=0===c.length?null:a(c);d=h.shift()}else d=c,c=null;b.operand=[d,c];delete b.handler;return b}}},35:{value:function(){var a=c.r(21),b=c.r(11).FN;return function(c,h,d){var f=a.exec(d);f.expr&&(f.expr.type===b&&f.expr.handler&&"integration"===f.expr.name)&&(f.expr=f.expr.handler(f.expr,h,[d.shift()]));c.operand=[f.expr,f.superscript,f.subscript];delete c.handler;return c}}},36:{value:function(){return function(a,b,c){b=c.shift();"object"===typeof b&&"combination"===b.name&&(b=b.operand.join(""));
a.operand=[b];delete a.handler;return a}}},37:{value:function(){return function(a,b,c){a.operand=[c.shift(),c.shift()];delete a.handler;return a}}},38:{value:function(){function a(a){var b;b=0===a.indexOf("\\")?!!g[a.substring(1)]:!1;if(b)return a.substring(1);switch(j.getLatexType(a)){case "operator":return j.getDefine(a);case "function":return j.getFuncDefine(a);default:if(/\\\s*$/.test(a))return"";a=0===a.indexOf("\\")?a+"\\":a;return a}}function b(a){return a.replace(/\s*([^a-z0-9\s])\s*/gi,function(a,
b){return b})}var e=c.r(67).Parser,h=c.r(1),d=c.r(8),f=c.r(66),k=c.r(7),m=c.r(9),g=c.r(10),j=c.r(4),r=RegExp("￸|￼","g"),i=RegExp("￸","g"),n=RegExp("￼","g");e.register("latex",e.implement({parse:function(a){a=this.split(this.format(a));a=this.parseToGroup(a);a=this.parseToStruct(a);return this.generateTree(a)},serialization:function(a,b){return f(a,b)},expand:function(a){var b=a.parse,c=null,e=a.pre,a=a.reverse,f;for(f in b)b.hasOwnProperty(f)&&(c=f.replace(/\\/g,""),k[c]=b[f]);for(f in a)a.hasOwnProperty(f)&&
(m[f.replace(/\\/g,"")]=a[f]);if(e)for(f in e)e.hasOwnProperty(f)&&(d[f.replace(/\\/g,"")]=e[f])},format:function(a){var c=RegExp("﻿","g"),a=b(a),a=a.replace(c,"").replace(/\\\\/g,"﻿"),a=a.replace(r,"").replace(/\\{/gi,"￸").replace(/\\}/gi,"￼"),e;for(e in d)d.hasOwnProperty(e)&&(a=d[e](a));return a.replace(c,"\\\\")},split:function(a){for(var b=[],c=/(?:\\[^a-z]\s*)|(?:\\[a-z]+\s*)|(?:[{}]\s*)|(?:[^\\{}]\s*)/gi,e=/^\s+|\s+$/g,d=null,a=a.replace(e,"");d=c.exec(a);)(d=d[0].replace(e,""))&&b.push(d);
return b},generateTree:function(a){for(var b=[],c=null;c=a.shift();)j.isArray(c)?b.push(this.generateTree(c)):b.push(c);b=h.toRPNExpression(b);return h.generateTree(b)},parseToGroup:function(a){for(var b=[],c=[b],e=0,d=0,f=0,j=[],g=0,h=a.length;g<h;g++)switch(a[g]){case "{":e++;c.push(b);b.push([]);b=b[b.length-1];break;case "}":e--;b=c.pop();break;case "\\left":d++;c.push(b);b.push([[]]);b=b[b.length-1][0];b.type="brackets";g++;b.leftBrackets=a[g].replace(i,"{").replace(n,"}");break;case "\\right":d--;
g++;b.rightBrackets=a[g].replace(i,"{").replace(n,"}");b=c.pop();break;case "\\begin":f++;c.push(b);b.push([[]]);b=b[b.length-1][0];b.type="begin";g+=2;for(j=[];a[g]&&"}"!==a[g];)j.push(a[g]),g++;b.beginType=j.join("");break;case "\\end":f--;g+=2;for(j=[];a[g]&&"}"!==a[g];)j.push(a[g]),g++;if(b.beginType!==j.join(""))throw Error("\\begin command error");b=c.pop();break;default:b.push(a[g].replace(i,"\\{").replace(n,"\\}"))}if(0!==e)throw Error("Group Error!");if(0!==f)throw Error("Cases Error!");
if(0!==d)throw Error("Brackets Error!");return c[0]},parseToStruct:function(b){for(var c=[],e=null,d=[],f=0,g=d=null,g=0,h=b.length;g<h;g++)if(null!==b[g])if(j.isArray(b[g]))if("brackets"===b[g].type)c.push(j.getBracketsDefine(b[g].leftBrackets,b[g].rightBrackets)),c.push(this.parseToStruct(b[g]));else if("begin"===b[g].type&&"cases"===b[g].beginType){e=[];f=0;d=[];for(g=b[g];g[f];)"\\\\"===g[f]?(d.push(e),e=[]):e.push(g[f]),f++;d.push(e);c.push(j.getCasesDefine(d.length));g=0;for(h=d.length;g<h;g++)c.push(this.parseToStruct(d[g]))}else if("begin"===
b[g].type&&("vmatrix"===b[g].beginType||"pmatrix"===b[g].beginType)){for(var h=b[g].beginType,e=[],f=0,g=b[g],d=[],i=0;g[f];)"\\\\"===g[f]?(e[i]||(e[i]=[]),e[i].push(this.parseToStruct(d)),i=0,d=[]):"&"===g[f]?(e[i]||(e[i]=[]),e[i].push(this.parseToStruct(d)),i++,d=[]):d.push(g[f]),f++;e[i]||(e[i]=[]);e[i].push(this.parseToStruct(d));d=e;c.push(j.getMatrixDefine(d.length,d[0].length,h));g=0;for(h=d[0].length;g<h;g++){f=0;for(e=d.length;f<e;f++)c.push(d[f][g])}}else if("begin"===b[g].type&&"split"===
b[g].beginType){e=[];f=0;g=b[g];d=[];for(i=0;g[f];)"\\\\"===g[f]?(f++,e[i]=this.parseToStruct(d),i++,d=[]):"&"===g[f]?(e[i]=this.parseToStruct(d),i++,d=[]):d.push(g[f]),f++;e[i]=this.parseToStruct(d);d=e;c.push(j.getSplitDefine(d.length));g=0;for(h=d.length;g<h;g++)c.push(d[g])}else c.push(this.parseToStruct(b[g]));else"\\underbrace"===b[g]?(c.push(a(b[g])),b[g+2]=null):(e=a(b[g]))&&c.push(e);return c}}))}},39:{value:function(){return function(a){return a.replace(/\\(i+)nt(\b|[^a-zA-Z])/g,function(a,
c,h){return"\\int "+c.length+h})}}},40:{value:function(){return function(a){return a.replace(/``/g,"“")}}},41:{value:function(){return function(a){if("{"===a[0]||"}"===a[0])a[0]="\\"+a[0];if("{"===a[1]||"}"===a[1])a[1]="\\"+a[1];return["\\left",a[0],a[2],"\\right",a[1]].join(" ")}}},42:{value:function(){return function(a){for(var b=[],c=0,h=a.length;c<h;c++)""===a[c]?b[b.length-1]+=a[c]:b.push(a[c]);return["\\begin{cases}",b.join(" \\\\ "),"\\end{cases}"].join(" ")}}},43:{value:function(){return function(a){return this.attr["data-root"]||
this.attr["data-placeholder"]?a.join(""):"{"+a.join("")+"}"}}},44:{value:function(){return function(a){return this.callFn?"\\dfrac "+a[0]+" "+a[1]:"\\frac "+a[0]+" "+a[1]}}},45:{value:function(){return function(a){var b=["\\"+a[0]];a[2]&&b.push("^"+a[2]);a[3]&&b.push("_"+a[3]);a[1]&&b.push(" "+a[1]);return b.join("")}}},46:{value:function(){return function(a){return"\\"+this.callFn.setType[0]+a[0]}}},47:{value:function(){return function(a){var b=["\\int "];if(this.callFn&&this.callFn.setType){for(var b=
["\\"],c=0,h=this.callFn.setType;c<h;c++)b.push("i");b.push("nt ")}a[1]&&b.push("^"+a[1]);a[2]&&b.push("_"+a[2]);a[0]&&b.push(" "+a[0]);return b.join("")}}},48:{value:function(){return function(a){return"\\mathbb{"+a[0]+"}"}}},49:{value:function(){return function(a){return"\\mathbf{"+a[0]+"}"}}},50:{value:function(){return function(a){return"\\mathcal{"+a[0]+"}"}}},51:{value:function(){return function(a){return"\\mathfrak{"+a[0]+"}"}}},52:{value:function(){return function(a){return"\\mathrm{"+a[0]+
"}"}}},53:{value:function(){return function(a){for(var b=this.callFn.setColNum[0],c=a.length/b,h=this.callFn.setType[0],d=[],f=0;f<c;f++)d[f]=a.slice(f*b,(f+1)*b).join("&");return["\\begin{"+h+"matrix}",d.join(" \\\\ "),"\\end{"+h+"matrix}"].join(" ")}}},54:{value:function(){return function(a){a=a[0];return"{"===a[0]?"\\overline"+a:"\\overline{"+a+"}"}}},55:{value:function(){return function(a){return"\\overparen "+a[0]}}},56:{value:function(){return function(a){a=a[0];return"{"===a[0]?"\\pmod"+a:
"\\pmod{"+a+"}"}}},57:{value:function(){return function(a){var b=["\\prod "];a[1]&&b.push("^"+a[1]);a[2]&&b.push("_"+a[2]);a[0]&&b.push(" "+a[0]);return b.join("")}}},58:{value:function(){return function(a){return a[0]+"^"+a[1]+"_"+a[2]}}},59:{value:function(){return function(a){for(var b=a[0],c=[],h=1;h<a.length;h++)c.push("&"+a[h]);return["\\begin{split}",b,c.join(" \\\\ "),"\\end{split}"].join(" ")}}},60:{value:function(){return function(a){var b=["\\sqrt"];a[1]&&b.push("["+a[1]+"]");b.push(" "+
a[0]);return b.join("")}}},61:{value:function(){return function(a){return a[0]+"_"+a[1]}}},62:{value:function(){return function(a){var b=["\\sum "];a[1]&&b.push("^"+a[1]);a[2]&&b.push("_"+a[2]);a[0]&&b.push(" "+a[0]);return b.join("")}}},63:{value:function(){return function(a){return a[0]+"^"+a[1]}}},64:{value:function(){return function(a){return"\\textcircled{"+a[0]+"}"}}},65:{value:function(){return function(a){return["\\underbrace",a[0]+"_"+a[1]].join(" ")}}},66:{value:function(){function a(c,
f){var k=[],m=null,m=null;if("object"!==typeof c)return e[c]?"\\"+c+" ":c.replace(h,function(a,b){return b+" "});"combination"===c.name&&(1===c.operand.length&&"combination"===c.operand[0].name)&&(c=c.operand[0]);for(var m=c.operand,g=0,j=m.length;g<j;g++)m[g]?k.push(a(m[g])):k.push(m[g]);m=c.attr&&c.attr._reverse?c.attr._reverse:c.name;return b[m].call(c,k,f)}var b=c.r(9),e=c.r(10),h=/(\\(?:[\w]+)|(?:[^a-z]))\\/gi;return function(b,c){return a(b,c)}}},67:{value:function(a,b,c){function h(a){this.impl=
new a;this.conf={}}function d(){this.conf={}}var f={},k={},m={extend:function(a,b){for(var c=null,b=[].slice.call(arguments,1),d=0,e=b.length;d<e;d++){var c=b[d],f;for(f in c)c.hasOwnProperty(f)&&(a[f]=c[f])}},setData:function(a,b,c){if("string"===typeof b)a[b]=c;else if("object"===typeof b)for(c in b)b.hasOwnProperty(c)&&(a[c]=b[c]);else throw Error("invalid option");}};m.extend(h.prototype,{config:function(a,b){m.setData(this.conf,a,b)},set:function(a,b){this.impl.set(a,b)},parse:function(a){a=
{config:{},tree:this.impl.parse(a)};m.extend(a.config,f,this.conf);return a},serialization:function(a,b){return this.impl.serialization(a,b)},expand:function(a){this.impl.expand(a)}});m.extend(d.prototype,{set:function(a,b){m.extend(this.conf,a,b)},parse:function(){throw Error("Abstract function");}});c.exports={Parser:{use:function(a){if(!k[a])throw Error("unknown parser type");return this.proxy(k[a])},config:function(a,b){m.setData(f,a,b);return this},register:function(a,b){k[a.toLowerCase()]=b;
return this},implement:function(a){var b=function(){},c=a.constructor||function(){},e=function(){this.conf={};c.call(this)};b.prototype=d.prototype;e.prototype=new b;delete a.constructor;for(var f in a)"constructor"!==f&&a.hasOwnProperty(f)&&(e.prototype[f]=a[f]);return e},proxy:function(a){return new h(a)}},ParserInterface:d}}},68:{value:function(){var a=c.r(67).Parser;c.r(38);window.kf.Parser=a;window.kf.Assembly=c.r(0)}}},t={"kf.start":68};try{c.r([t["kf.start"]])}catch(u){}})();