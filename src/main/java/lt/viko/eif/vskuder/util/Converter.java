package lt.viko.eif.vskuder.util;

import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
/**
 * Class for converting xml to pdf.
 */
public class Converter {
    /**
     * Convert xml to pdf.
     *
     * @param xmlFilePath       xml file path
     * @param xslFilePath       xsl file path
     * @param outputPdfFilePath output pdf file path
     * @throws Exception exception
     */
    public void convertToPDF(String xmlFilePath, String xslFilePath, String outputPdfFilePath) throws Exception {
        // the XSL FO file
        File xsltFile = new File(xslFilePath);
        // the XML file which provides the input
        StreamSource xmlSource = new StreamSource(new File(xmlFilePath));
        // create an instance of fop factory
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        // a user agent is needed for transformation
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
        // Setup output
        OutputStream out = new BufferedOutputStream(new FileOutputStream(new File(outputPdfFilePath)));
        try {
            // Construct fop with desired output format
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

            // Setup XSLT
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

            // Resulting SAX events (the generated FO) must be piped through to FOP
            Result res = new SAXResult(fop.getDefaultHandler());

            // Start XSLT transformation and FOP processing
            transformer.transform(xmlSource, res);
        } finally {
            out.close();
        }
    }
    /**
     * Convert xml to html.
     *
     * @param xmlFilePath       xml file path
     * @param xslFilePath       xsl file path
     * @param outputHtmlFilePath output html file path
     */
    public void convertToHTML(String xmlFilePath, String xslFilePath, String outputHtmlFilePath) {
        try {
            StreamSource xmlFile = new StreamSource(new File(xmlFilePath));
            StreamSource xslFile = new StreamSource(new File(xslFilePath));
            StreamResult htmlFile = new StreamResult(new File(outputHtmlFilePath));

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(xslFile);

            transformer.transform(xmlFile, htmlFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
