<#macro mainLayout title="Spring Freemarker Project">
	<#assign ctx = rc.contextPath />
    <!DOCTYPE html>
    <html lang="utf-8">
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <head>
            <title>${title}</title>
        </head>
        <body>
            <@header/>

            <div>
                <#nested/>
            </div>

            <@footer/>

        </body>
    </html>
</#macro>

<#macro header>
    <div id="header">
    </div>
</#macro>

<#macro footer>
    <div id="footer">
    </div>
</#macro>