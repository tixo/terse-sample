<table>
	<tr>
		<td>主题</td>
		<td>作者</td>
		<td>时间</td>
	</tr>
	<#list view.page.list as p >
		<tr>
			<td>${p.title}</td>
			<td>${p.user.name}</td>
			<td>${p.timestatp}</td>
		</tr>
	</#list>
</table>