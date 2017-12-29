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


        #login-box {
            /*border:1px solid #F00;*/
            padding: 20px;
            border-radius: 15px;
            background: #367fa9;
            color: #fff;
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
                    <label class="col-sm-3 control-label">工号</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="code" placeholder="请输入工号" name="code">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">密码</label>
                    <div class="col-sm-9">
                        <input type="password" class="form-control" id="psd" placeholder="请输入密码" name="psd">
                    </div>
                </div>
                <div class="form-group pull-right" style="margin-right: 15px;">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="button" class="btn btn-default btn-info" id="loginBtn">登录</button>
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