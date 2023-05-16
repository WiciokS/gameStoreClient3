<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                xmlns:ns2="gamestoresoap">
    <xsl:output method="xml" version="1.0" omit-xml-declaration="no" indent="yes"/>
    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="simple"
                                       page-height="29.7cm"
                                       page-width="21cm"
                                       margin-top="1cm"
                                       margin-bottom="2cm"
                                       margin-left="2.5cm"
                                       margin-right="2.5cm">
                    <fo:region-body margin-top="3cm" background-color="#FAFAFA"/> <!-- Set background color here -->
                    <fo:region-before extent="3cm"/>
                    <fo:region-after extent="1.5cm"/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="simple">
                <fo:flow flow-name="xsl-region-body">
                    <fo:block font-family="Arial" font-size="24pt" text-align="center" space-after="1cm">User Data PDF File</fo:block>
                    <fo:block>
                        <fo:external-graphic src="url(picture.jpg)" content-width="16cm" scaling="uniform"/>
                    </fo:block>
                    <fo:block space-after="1cm">
                        <fo:inline font-weight="bold">Username: </fo:inline>
                        <fo:inline><xsl:value-of select="//ns2:Library/user/username"/></fo:inline>
                    </fo:block>
                    <fo:block space-after="1cm">
                        <fo:inline font-weight="bold">Password: </fo:inline>
                        <fo:inline><xsl:value-of select="//ns2:Library/user/password"/></fo:inline>
                    </fo:block>
                    <fo:block space-after="0.1cm">
                        <fo:inline font-weight="bold">Games Table: </fo:inline>
                    </fo:block>
                    <fo:table table-layout="fixed" width="100%" border="2px solid black" border-collapse="collapse">
                        <fo:table-column column-width="25%"/>
                        <fo:table-column column-width="25%"/>
                        <fo:table-column column-width="25%"/>
                        <fo:table-column column-width="25%"/>
                        <fo:table-header>
                            <fo:table-row background-color="#C1C1C1">
                                <fo:table-cell padding="6pt" border="1px solid black"> <!-- Set table cell color here -->
                                    <fo:block font-weight="bold">Title</fo:block>
                                </fo:table-cell>
                                <fo:table-cell padding="6pt" border="1px solid black">
                                    <fo:block font-weight="bold">Price</fo:block>
                                </fo:table-cell>
                                <fo:table-cell padding="6pt" border="1px solid black">
                                    <fo:block font-weight="bold">Developer</fo:block>
                                </fo:table-cell>
                                <fo:table-cell padding="6pt" border="1px solid black">
                                    <fo:block font-weight="bold">Category</fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-header>
                        <fo:table-body>
                            <xsl:for-each select="//ns2:Library/games">
                                <fo:table-row>
                                    <fo:table-cell padding="6pt" border="1px solid black" background-color="#ffffff"> <!-- Set table cell color here -->
                                        <fo:block><xsl:value-of select="title"/></fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell padding="6pt" border="1px solid black" background-color="#ffffff">
                                        <fo:block><xsl:value-of select="price"/></fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell padding="6pt" border="1px solid black" background-color="#ffffff">
                                        <fo:block><xsl:value-of select="developer/name"/></fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell padding="6pt" border="1px solid black" background-color="#ffffff">
                                        <fo:block><xsl:value-of select="category/name"/></fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                            </xsl:for-each>
                        </fo:table-body>
                    </fo:table>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
</xsl:stylesheet>
