<head>
	<script>
        $(document).ready(function(){
            // Validate
            // http://bassistance.de/jquery-plugins/jquery-plugin-validation/
            // http://docs.jquery.com/Plugins/Validation/
            // http://docs.jquery.com/Plugins/Validation/validate#toptions
            $('#createForm').validate({
                highlight: function(element) {
                    $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
                },
                success: function(element) {
                    element.text('OK!').addClass('valid') .closest('.form-group').removeClass('has-error').addClass('has-success');
                }
            });

        }); // end document.ready
	</script>
</head>
<body>
<form id="createForm" class="form-horizontal" style="margin-top: 20px" method="post" action="create.shtml">
    <div class="form-group">
        <label class="col-lg-2 control-label">姓名</label>
        <div class="col-lg-6">
            <input type="text require" class="form-control required" name="view.post.user.name">
        </div>
    </div>
    <div class="form-group">
        <label for="inputEmail1" class="col-lg-2 control-label ">邮件</label>
        <div class="col-lg-6">
            <input type="email" class="form-control required email" name="view.post.user.email">
        </div>
    </div>
    <div class="form-group">
        <label for="inputEmail1" class="col-lg-2 control-label">标题</label>
        <div class="col-lg-6">
            <input type="text" class="form-control required" name="view.post.title">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword1" class="col-lg-2 control-label">内容</label>
        <div class="col-lg-6">
            <textarea class="form-control required" rows="15" name="view.post.body"></textarea>
        </div>
    </div>
    <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
            <button type="submit" class="btn btn-primary">提交</button>
        </div>
    </div>
</form>
</body>