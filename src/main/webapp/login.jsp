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


        .row{
            position: relative;
            top: 15%;
        }

        body {
            overflow-y: scroll;
        }
    </style>
</head>
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
<meta http-equiv="X-UA-Compatible" content="IE=9" />
<script type="text/javascript" src="/js/jquery-1.11.1.min.js"></script>
<script src="/js/html5shiv.min.js"></script>
<script src="/js/respond.min.js"></script>
<script type="text/javascript" src="/js/jquery.placeholder.js"></script>
<![endif]-->
<!--[if IE 9]>
<script type="text/javascript" src="/js/jquery.placeholder.js"></script>
<![endif]-->
<body style="overflow: hidden">
<div class="container" id="top" style="position:absolute; width:100%; height:100%; z-index:-1 ;padding: 0;">
    <img src="images/background.png" style="position:fixed;" height="100%" width="100%"/>
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

//  使IE8支持 placeholder
    $(function () {
        // Invoke the plugin
        $('input, textarea').placeholder();
    });

    //回车提交
    $('#psd').bind('keypress',function(event){
        if(event.keyCode == "13")
        {
            //密码加密后再传输
            $('#psd').val(Encrypting($('#code').val(), $('#psd').val()));
            $('#loginForm').submit();
        }
    });

</script>
</html>