<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:ns2="gamestoresoap">
    <xsl:output method="html"/>

    <xsl:template match="/ns2:Library">
        <html>
            <body style="text-align:center; font-family: Arial, sans-serif; background-color:#f0f0f0;">
                <h1 style="color:#333; margin-bottom: 20px;">User Data HTML File</h1>
                <div>
                    <img src="classic-dancing-banana-gif.gif" width="300" height="200" alt="image"/>
                </div>
                <h2 style="color:#666;">User</h2>
                <p>
                    <strong>Username: </strong><xsl:value-of select="user/username"/>
                </p>
                <p>
                    <strong>Password: </strong><xsl:value-of select="user/password"/>
                </p>
                <h2 style="color:#666;">Games</h2>
                <table border="1" style="width:60%; margin: 0 auto; border-collapse: collapse;">
                    <tr style="background-color:#C1C1C1;">
                        <th>Title</th>
                        <th>Price</th>
                        <th>Developer</th>
                        <th>Category</th>
                    </tr>
                    <xsl:for-each select="games">
                        <tr style="background-color:#ffffff;">
                            <td><xsl:value-of select="title"/></td>
                            <td><xsl:value-of select="price"/></td>
                            <td><xsl:value-of select="developer/name"/></td>
                            <td><xsl:value-of select="category/name"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
