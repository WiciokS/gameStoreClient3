
package lt.viko.eif.vskuder.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gameTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gamePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="gameDeveloperId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gameCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gameTitle",
    "gamePrice",
    "gameDeveloperId",
    "gameCategoryId"
})
@XmlRootElement(name = "createGameRequest")
public class CreateGameRequest {

    @XmlElement(required = true)
    protected String gameTitle;
    protected double gamePrice;
    protected int gameDeveloperId;
    protected int gameCategoryId;

    /**
     * Gets the value of the gameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGameTitle() {
        return gameTitle;
    }

    /**
     * Sets the value of the gameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGameTitle(String value) {
        this.gameTitle = value;
    }

    /**
     * Gets the value of the gamePrice property.
     * 
     */
    public double getGamePrice() {
        return gamePrice;
    }

    /**
     * Sets the value of the gamePrice property.
     * 
     */
    public void setGamePrice(double value) {
        this.gamePrice = value;
    }

    /**
     * Gets the value of the gameDeveloperId property.
     * 
     */
    public int getGameDeveloperId() {
        return gameDeveloperId;
    }

    /**
     * Sets the value of the gameDeveloperId property.
     * 
     */
    public void setGameDeveloperId(int value) {
        this.gameDeveloperId = value;
    }

    /**
     * Gets the value of the gameCategoryId property.
     * 
     */
    public int getGameCategoryId() {
        return gameCategoryId;
    }

    /**
     * Sets the value of the gameCategoryId property.
     * 
     */
    public void setGameCategoryId(int value) {
        this.gameCategoryId = value;
    }

}
