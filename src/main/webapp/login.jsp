<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>绍兴市第七人民医院信息维护平台</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入bootstrap -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
    <!-- 引入JQuery  bootstrap.js pwd-encryption-->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/pwd-encryption.js"></script>
    <style type="text/css">
        body {
            background: url(images/a.jpg) repeat;
            background-size: 100%;
        }

        html,body{
            height: 100%;
        }

        .container {
            height: 100%;
        }

        .row{
            position: relative;
            top: 15%;
        }



    </style>
</head>
<body>
<div class="container" id="top">
    <div class="row" style="margin-top: 280px; ">
        <div class="col-md-4"></div>
        <div class="col-md-4" id="login-box">
            <form class="form-horizontal" role="form" action="/login" id="loginForm" method="post">
                <div class="form-group">
                    <label class="col-sm-2 control-label"></label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="code" placeholder="工号" name="code">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label"></label>
                    <div class="col-sm-8">
                        <input type="password" class="form-control" id="psd" placeholder="密码" name="psd">
                    </div>
                </div>
                <div class="form-group" style="align-content: center" >
                    <div class="col-sm-offset-2 col-sm-8" >
                        <button type="button" class="btn btn-default btn-info btn-block" id="loginBtn">登录</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="col-md-4"></div>
    </div>
</div>
</body>
<script type="text/javascript">

    //登录按钮点击
    $('#loginBtn').on('click', function () {
        //密码加密后再传输
        $('#psd').val(Encrypting($('#code').val(), $('#psd').val()));
        $('#loginForm').submit();
    });

</script>
</html>