<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src=" https://code.jquery.com/jquery-3.5.0.min.js"></script>
<script type="text/javascript">

  function ajaxProcess(url,data,dataType){
	  $.ajax({
			url:url,
			dataType:dataType,
			type:'POST',
			data:{job:data},
			success:function(v){
				//console.log(v);
				//console.log(v);
				//$("span").html(v.author+" "+v.subject);
				$("span").empty();
				$(v).each(function(index,dom){
					$("span").append(dom.deptno+" "+dom.dname+" "+dom.loc);
				});
				
			},error:function(){
				alert('error');
			}
		 });
  }
  $(function(){
	 $("button").click(function(){
		 switch ($(this).attr("id")) {
		case "c1":	
			ajaxProcess("/orm/ajaxMap.do",'java','text');
			break;
		case "c2":	
			ajaxProcess("/orm/ajaxMap.do",'jsp','text');
			break;
		case "c3":	
			ajaxProcess("/orm/ajaxMap.do",'oracle','text');
			break;
			
		case "c4":	
			ajaxProcess("/orm/ajaxMap2.do",'6','json');
			break;	
		case "c5":	
			ajaxProcess("/orm/ajaxMap2.do",'10','json');
			break;	
		case "c6":	
			ajaxProcess("/orm/ajaxMap3.do",'','json');
			break;	
		default:
			break;
		}
	 });
  });

</script>  
</head>
<body>

<button id="c1">Click1</button><button id="c2">Click2</button>
<button id="c3">Click3</button>
<button id="c4">Click4</button>
<button id="c5">Click5</button>
<button id="c6">Click6</button>
<br>
<span>
<!-- <script type="text/javascript">alert('ttt')</script> -->
</span>
</body>
</html>







