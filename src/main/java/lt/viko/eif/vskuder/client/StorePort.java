
package lt.viko.eif.vskuder.client;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StorePort", targetNamespace = "http://spring.io/guides/gs-producing-web-service")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StorePort {


    /**
     * 
     * @param getUsersRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetUsersResponse
     */
    @WebMethod
    @WebResult(name = "getUsersResponse", targetNamespace = "gamestoresoap", partName = "getUsersResponse")
    public GetUsersResponse getUsers(
        @WebParam(name = "getUsersRequest", targetNamespace = "gamestoresoap", partName = "getUsersRequest")
        GetUsersRequest getUsersRequest);

    /**
     * 
     * @param getCategoryRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetCategoryResponse
     */
    @WebMethod
    @WebResult(name = "getCategoryResponse", targetNamespace = "gamestoresoap", partName = "getCategoryResponse")
    public GetCategoryResponse getCategory(
        @WebParam(name = "getCategoryRequest", targetNamespace = "gamestoresoap", partName = "getCategoryRequest")
        GetCategoryRequest getCategoryRequest);

    /**
     * 
     * @param removeDeveloperRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.RemoveDeveloperResponse
     */
    @WebMethod
    @WebResult(name = "removeDeveloperResponse", targetNamespace = "gamestoresoap", partName = "removeDeveloperResponse")
    public RemoveDeveloperResponse removeDeveloper(
        @WebParam(name = "removeDeveloperRequest", targetNamespace = "gamestoresoap", partName = "removeDeveloperRequest")
        RemoveDeveloperRequest removeDeveloperRequest);

    /**
     * 
     * @param getGamesRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetGamesResponse
     */
    @WebMethod
    @WebResult(name = "getGamesResponse", targetNamespace = "gamestoresoap", partName = "getGamesResponse")
    public GetGamesResponse getGames(
        @WebParam(name = "getGamesRequest", targetNamespace = "gamestoresoap", partName = "getGamesRequest")
        GetGamesRequest getGamesRequest);

    /**
     * 
     * @param updateDeveloperRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.UpdateDeveloperResponse
     */
    @WebMethod
    @WebResult(name = "updateDeveloperResponse", targetNamespace = "gamestoresoap", partName = "updateDeveloperResponse")
    public UpdateDeveloperResponse updateDeveloper(
        @WebParam(name = "updateDeveloperRequest", targetNamespace = "gamestoresoap", partName = "updateDeveloperRequest")
        UpdateDeveloperRequest updateDeveloperRequest);

    /**
     * 
     * @param updateCategoryRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.UpdateCategoryResponse
     */
    @WebMethod
    @WebResult(name = "updateCategoryResponse", targetNamespace = "gamestoresoap", partName = "updateCategoryResponse")
    public UpdateCategoryResponse updateCategory(
        @WebParam(name = "updateCategoryRequest", targetNamespace = "gamestoresoap", partName = "updateCategoryRequest")
        UpdateCategoryRequest updateCategoryRequest);

    /**
     * 
     * @param getCategoriesRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetCategoriesResponse
     */
    @WebMethod
    @WebResult(name = "getCategoriesResponse", targetNamespace = "gamestoresoap", partName = "getCategoriesResponse")
    public GetCategoriesResponse getCategories(
        @WebParam(name = "getCategoriesRequest", targetNamespace = "gamestoresoap", partName = "getCategoriesRequest")
        GetCategoriesRequest getCategoriesRequest);

    /**
     * 
     * @param removeCategoryRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.RemoveCategoryResponse
     */
    @WebMethod
    @WebResult(name = "removeCategoryResponse", targetNamespace = "gamestoresoap", partName = "removeCategoryResponse")
    public RemoveCategoryResponse removeCategory(
        @WebParam(name = "removeCategoryRequest", targetNamespace = "gamestoresoap", partName = "removeCategoryRequest")
        RemoveCategoryRequest removeCategoryRequest);

    /**
     * 
     * @param removeUserRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.RemoveUserResponse
     */
    @WebMethod
    @WebResult(name = "removeUserResponse", targetNamespace = "gamestoresoap", partName = "removeUserResponse")
    public RemoveUserResponse removeUser(
        @WebParam(name = "removeUserRequest", targetNamespace = "gamestoresoap", partName = "removeUserRequest")
        RemoveUserRequest removeUserRequest);

    /**
     * 
     * @param addItemToLibraryRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.AddItemToLibraryResponse
     */
    @WebMethod
    @WebResult(name = "addItemToLibraryResponse", targetNamespace = "gamestoresoap", partName = "addItemToLibraryResponse")
    public AddItemToLibraryResponse addItemToLibrary(
        @WebParam(name = "addItemToLibraryRequest", targetNamespace = "gamestoresoap", partName = "addItemToLibraryRequest")
        AddItemToLibraryRequest addItemToLibraryRequest);

    /**
     * 
     * @param updateGameRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.UpdateGameResponse
     */
    @WebMethod
    @WebResult(name = "updateGameResponse", targetNamespace = "gamestoresoap", partName = "updateGameResponse")
    public UpdateGameResponse updateGame(
        @WebParam(name = "updateGameRequest", targetNamespace = "gamestoresoap", partName = "updateGameRequest")
        UpdateGameRequest updateGameRequest);

    /**
     * 
     * @param getDeveloperRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetDeveloperResponse
     */
    @WebMethod
    @WebResult(name = "getDeveloperResponse", targetNamespace = "gamestoresoap", partName = "getDeveloperResponse")
    public GetDeveloperResponse getDeveloper(
        @WebParam(name = "getDeveloperRequest", targetNamespace = "gamestoresoap", partName = "getDeveloperRequest")
        GetDeveloperRequest getDeveloperRequest);

    /**
     * 
     * @param getUserRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetUserResponse
     */
    @WebMethod
    @WebResult(name = "getUserResponse", targetNamespace = "gamestoresoap", partName = "getUserResponse")
    public GetUserResponse getUser(
        @WebParam(name = "getUserRequest", targetNamespace = "gamestoresoap", partName = "getUserRequest")
        GetUserRequest getUserRequest);

    /**
     * 
     * @param getGameRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetGameResponse
     */
    @WebMethod
    @WebResult(name = "getGameResponse", targetNamespace = "gamestoresoap", partName = "getGameResponse")
    public GetGameResponse getGame(
        @WebParam(name = "getGameRequest", targetNamespace = "gamestoresoap", partName = "getGameRequest")
        GetGameRequest getGameRequest);

    /**
     * 
     * @param createCategoryRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.CreateCategoryResponse
     */
    @WebMethod
    @WebResult(name = "createCategoryResponse", targetNamespace = "gamestoresoap", partName = "createCategoryResponse")
    public CreateCategoryResponse createCategory(
        @WebParam(name = "createCategoryRequest", targetNamespace = "gamestoresoap", partName = "createCategoryRequest")
        CreateCategoryRequest createCategoryRequest);

    /**
     * 
     * @param getLibraryUserRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetLibraryUserResponse
     */
    @WebMethod
    @WebResult(name = "getLibraryUserResponse", targetNamespace = "gamestoresoap", partName = "getLibraryUserResponse")
    public GetLibraryUserResponse getLibraryUser(
        @WebParam(name = "getLibraryUserRequest", targetNamespace = "gamestoresoap", partName = "getLibraryUserRequest")
        GetLibraryUserRequest getLibraryUserRequest);

    /**
     * 
     * @param removeItemFromLibraryRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.RemoveItemFromLibraryResponse
     */
    @WebMethod
    @WebResult(name = "removeItemFromLibraryResponse", targetNamespace = "gamestoresoap", partName = "removeItemFromLibraryResponse")
    public RemoveItemFromLibraryResponse removeItemFromLibrary(
        @WebParam(name = "removeItemFromLibraryRequest", targetNamespace = "gamestoresoap", partName = "removeItemFromLibraryRequest")
        RemoveItemFromLibraryRequest removeItemFromLibraryRequest);

    /**
     * 
     * @param createUserRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.CreateUserResponse
     */
    @WebMethod
    @WebResult(name = "createUserResponse", targetNamespace = "gamestoresoap", partName = "createUserResponse")
    public CreateUserResponse createUser(
        @WebParam(name = "createUserRequest", targetNamespace = "gamestoresoap", partName = "createUserRequest")
        CreateUserRequest createUserRequest);

    /**
     * 
     * @param createDeveloperRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.CreateDeveloperResponse
     */
    @WebMethod
    @WebResult(name = "createDeveloperResponse", targetNamespace = "gamestoresoap", partName = "createDeveloperResponse")
    public CreateDeveloperResponse createDeveloper(
        @WebParam(name = "createDeveloperRequest", targetNamespace = "gamestoresoap", partName = "createDeveloperRequest")
        CreateDeveloperRequest createDeveloperRequest);

    /**
     * 
     * @param removeGameRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.RemoveGameResponse
     */
    @WebMethod
    @WebResult(name = "removeGameResponse", targetNamespace = "gamestoresoap", partName = "removeGameResponse")
    public RemoveGameResponse removeGame(
        @WebParam(name = "removeGameRequest", targetNamespace = "gamestoresoap", partName = "removeGameRequest")
        RemoveGameRequest removeGameRequest);

    /**
     * 
     * @param updateUserRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.UpdateUserResponse
     */
    @WebMethod
    @WebResult(name = "updateUserResponse", targetNamespace = "gamestoresoap", partName = "updateUserResponse")
    public UpdateUserResponse updateUser(
        @WebParam(name = "updateUserRequest", targetNamespace = "gamestoresoap", partName = "updateUserRequest")
        UpdateUserRequest updateUserRequest);

    /**
     * 
     * @param createGameRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.CreateGameResponse
     */
    @WebMethod
    @WebResult(name = "createGameResponse", targetNamespace = "gamestoresoap", partName = "createGameResponse")
    public CreateGameResponse createGame(
        @WebParam(name = "createGameRequest", targetNamespace = "gamestoresoap", partName = "createGameRequest")
        CreateGameRequest createGameRequest);

    /**
     * 
     * @param getLibraryRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetLibraryResponse
     */
    @WebMethod
    @WebResult(name = "getLibraryResponse", targetNamespace = "gamestoresoap", partName = "getLibraryResponse")
    public GetLibraryResponse getLibrary(
        @WebParam(name = "getLibraryRequest", targetNamespace = "gamestoresoap", partName = "getLibraryRequest")
        GetLibraryRequest getLibraryRequest);

    /**
     * 
     * @param getDevelopersRequest
     * @return
     *     returns lt.viko.eif.vskuder.client2.GetDevelopersResponse
     */
    @WebMethod
    @WebResult(name = "getDevelopersResponse", targetNamespace = "gamestoresoap", partName = "getDevelopersResponse")
    public GetDevelopersResponse getDevelopers(
        @WebParam(name = "getDevelopersRequest", targetNamespace = "gamestoresoap", partName = "getDevelopersRequest")
        GetDevelopersRequest getDevelopersRequest);

}