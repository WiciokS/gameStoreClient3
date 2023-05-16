package lt.viko.eif.vskuder.util;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for converting object to xml.
 */
public class JAXBTransformer {
    /**
     * Class for marshalling.
     */
    private Class<?> marshalledClass;

    /**
     * Marshaller.
     */
    private Marshaller marshaller;

    /**
     * Unmarshaller.
     */
    private Unmarshaller unmarshaller;

    /**
     * Constructor with parameters.
     *
     * @param marshalledClass class for marshalling
     */
    public JAXBTransformer(Class<?> marshalledClass) {
        this.marshalledClass = marshalledClass;
        createMarshaller();
        createUnmarshaller();
    }

    /**
     * No-Args constructor.
     */
    public JAXBTransformer() {
    }

    /**
     * Get marshalled class.
     *
     * @return marshalled class
     */
    public Class<?> getMarshalledClass() {
        return marshalledClass;
    }

    /**
     * Set marshalled class.
     *
     * @param marshalledClass marshalled class
     */
    public void setMarshalledClass(Class<?> marshalledClass) {
        this.marshalledClass = marshalledClass;
    }

    /**
     * Get marshaller.
     *
     * @return marshaller
     */
    public Marshaller getMarshaller() {
        return marshaller;
    }

    /**
     * Set marshaller.
     *
     * @param marshaller marshaller
     */
    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    /**
     * Get unmarshaller.
     *
     * @return unmarshaller
     */
    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }

    /**
     * Set unmarshaller.
     *
     * @param unmarshaller unmarshaller
     */
    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    /**
     * Create marshaller.
     */
    public void createMarshaller() {
        try {
            marshaller = JAXBContext.newInstance(marshalledClass).createMarshaller();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create unmarshaller.
     */
    public void createUnmarshaller() {
        try {
            unmarshaller = JAXBContext.newInstance(marshalledClass).createUnmarshaller();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Save object to file.
     *
     * @param object object
     * @param path   path
     */
    public void toXml(Object object, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, fileWriter);
            fileWriter.close();
        } catch (IOException | JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
