<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<script src="js/libs/jquery-2.1.1.min.js"></script>
<select id="cate"></select>
<script type="text/javascript">
			$.ajax({
			url :'/category/listAll',
			success: function(data) {
				for (var inx in data) {
					$('#cate').append('<option>'+ data[inx].name+'</option>')
				}
				
			},
			error:function(){
				alert("1");
			}
		});
	
	
</script>

</body>
</html>
