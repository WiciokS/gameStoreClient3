
package lt.viko.eif.vskuder.client;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for Library complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Library">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user" type="{gamestoresoap}User"/>
 *         &lt;element name="games" type="{gamestoresoap}Game" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Library", propOrder = {
    "id",
    "user",
    "games"
})
@XmlRootElement(name = "Library")
public class Library {

    protected int id;
    @XmlElement(required = true)
    protected User user;
    @XmlElement(required = true)
    protected List<Game> games;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the games property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the games property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Game }
     * 
     * 
     */
    public List<Game> getGames() {
        if (games == null) {
            games = new ArrayList<Game>();
        }
        return this.games;
    }

}
