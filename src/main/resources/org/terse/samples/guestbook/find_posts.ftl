<head>
	<link href="${base}/resource/css/terse-page.css">
</head>
<body>
<input type="button" value="我要留言-->" class="btn btn-info"
       onclick="javascript:window.location.href='create_post.shtml';"/>
    <table cellpadding="0" cellspacing="0" border="0" class="table table-hover">
        <thead>
	        <tr>
	            <th>主题</th>
	            <th>作者</th>
	            <th>时间</th>
	        </tr>
	    </thead>
	    <tbody>
		    <#if view.page.list?size &gt; 0><#list view.page.list as p >
	        <tr>
	            <td>${p.title}</td>
	            <td>${p.user.name}</td>
	            <td>${p.timestamp?string("yyyy-MM-dd")}</td>
	        </tr>
		    </#list>
		    <#else>
		    <tr>
			    <td colspan="3">暂无数据</td>
		    </tr>
		    </#if>
	    </tbody>
    <#if view.page.list?size &gt; 0>
        <tfoot>
        <tr>
            <td colspan="3" align="right">
            ${view.page.getPageInfo("find_posts.shtml")}
            </td>
        </tr>
        </tfoot>
    </#if>
	</table>

</body>
