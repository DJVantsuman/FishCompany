<%-- 
    Document   : indexSuccess
    Created on : 16.08.2016, 23:15:21
    Author     : Ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<a href="../web.xml"></a>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FTC</title>
        <style type="text/css">
                        
            body{ background-color: #E6E6FA }

            #wrapper{
                width: 1000px;
                margin: 10px auto;
            }

            #header{
                height: 100px;
                border-bottom-style: solid;
                border-bottom-width: 2px;
            }

            #headerImage{
                height: 100px;
                width: 200px;
                float: left
            }

            #headerRegistration{
                height: 25px;
                width: 160px;
                float: right
            }

            #headerFTC{            
                height: 50px; 
            }

            #menu{
                width: 192px;
                height: 600px;
                background: #D3D3D3;
                border-left-style: solid;
                border-left-color: #A9A9A9;
                border-bottom-style: solid;
                border-bottom-color: #A9A9A9;
                float: left 
                    
            }
            
            #reclame{
                width: 175px;
                height: 175px;
                background: #F8F8FF;
                margin: 10px auto;
                border-style: solid;
                border-color: #A9A9A9;
                border-width:2px
            }

            #content{
                width: 800px;
                height: 600px;
                border-left-width: 2px;
                border-left-style: solid;
                border-right-style: solid;
                border-right-color: #A9A9A9;
                border-bottom-style: solid;
                border-bottom-color: #A9A9A9;
                background: #F8F8FF;                
                float: right
            }

            #footer{
                clear: both;
                width: 1000px;
                height: 50px;
            }

            .line{ 
                display: inline;
                font-size: 18px
            }

        </style>
    </head>
    <body>
        <div id="wrapper">

            <div id="header">
                <div id="headerImage"> 
                    Image
                </div>
                <div>
                    <div id="headerRegistration">
                        <p class="line"> Здравствуйте, <pre>${lastName} ${firstName}</a> </p>
                    </div>
                    <div id="headerFTC" style="clear: right" >
                        <h1 align="center">Fish Trade Company</h1>
                    </div>
                    <div height: 25px;>
                            <p class="line"> Главная|</p>
                            <p class="line"> Продукция| </p>
                            <p class="line"> Производство| </p>
                            <p class="line"> Партнерам| </p>
                            <p class="line"> Контакты </p>
                    </div>
                </div>
            </div>

            <div id="content">  </div>

            <div id="menu"> 
                <div id="reclame"> </div>
                <div id="reclame"> </div>
                <div id="reclame"> </div>
            </div>

            <div id="footer"> <pre><h3 align="right"> Украина, г.Киев, ул.Боровая 41     тел: 044 555 789 32</h3></pre> </div>

        </div>
    </body>
</html>
