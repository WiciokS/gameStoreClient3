package lt.viko.eif.vskuder.REST;

import lt.viko.eif.vskuder.client.*;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Class for interacting with SOAP.
 */
public class InteractRest {
    private WebClient webClient = WebClient.create("http://localhost:8080");
    /**
     * Method to add item to library.
     *
     * @param request request
     * @return response
     */
    public AddItemToLibraryResponse addItemToLibrary(AddItemToLibraryRequest request) {

        AddItemToLibraryResponse response = webClient.post()  // Assuming it's a POST request
                .uri("/library/addItemToLibrary")  // The URL where the service is hosted
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(AddItemToLibraryResponse.class)
                .block();  // Blocking here, to get the actual result

        return response;
    }
    /**
     * Method to create category.
     *
     * @param request request
     * @return response
     */
    public CreateCategoryResponse createCategory(CreateCategoryRequest request) {

        CreateCategoryResponse response = webClient.post()
                .uri("/library/game/category/createCategory")  // The URL where the service is hosted
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(CreateCategoryResponse.class)
                .block();

        return response;
    }
    /**
     * Method to create developer.
     *
     * @param request request
     * @return response
     */
    public CreateDeveloperResponse createDeveloper(CreateDeveloperRequest request) {

        CreateDeveloperResponse response = webClient.post()
                .uri("/library/game/developer/createDeveloper")  // The URL where the service is hosted
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(CreateDeveloperResponse.class)
                .block();

        return response;
    }
    /**
     * Method to create game.
     *
     * @param request request
     * @return response
     */
    public CreateGameResponse createGame(CreateGameRequest request) {

        CreateGameResponse response = webClient.post()
                .uri("/library/game/createGame")  // The URL where the service is hosted
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(CreateGameResponse.class)
                .block();

        return response;
    }
    /**
     * Method to create user.
     *
     * @param request request
     * @return response
     */
    public CreateUserResponse createUser(CreateUserRequest request) {

        CreateUserResponse response = webClient.post()
                .uri("/library/user/createUser")  // The URL where the service is hosted
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(CreateUserResponse.class)
                .block();

        return response;
    }
    /**
     * Method to get all categories.
     *
     * @param request request
     * @return response
     */
    public GetCategoriesResponse getCategories(GetCategoriesRequest request) {

        GetCategoriesResponse response = webClient.get() // Assuming it's a GET request
                .uri("/library/game/category/getCategories")  // The URL where the service is hosted
                .retrieve()
                .bodyToMono(GetCategoriesResponse.class)
                .block();  // Blocking here, to get the actual result

        return response;
    }
    /**
     * Method to get category.
     *
     * @param request request
     * @return response
     */
    public GetCategoryResponse getCategory(GetCategoryRequest request) {

        GetCategoryResponse response = webClient.get()
                .uri("/library/game/category/getCategory/" + request.getCategoryId())
                .retrieve()
                .bodyToMono(GetCategoryResponse.class)
                .block();

        return response;
    }
    /**
     * Method to get developer.
     *
     * @param request request
     * @return response
     */
    public GetDeveloperResponse getDeveloper(GetDeveloperRequest request) {

        GetDeveloperResponse response = webClient.get()
                .uri("/library/game/developer/getDeveloper/" + request.getDeveloperId())
                .retrieve()
                .bodyToMono(GetDeveloperResponse.class)
                .block();

        return response;
    }
    /**
     * Method to get developers.
     *
     * @param request request
     * @return response
     */
    public GetDevelopersResponse getDevelopers(GetDevelopersRequest request) {

        GetDevelopersResponse response = webClient.get()
                .uri("/library/game/developer/getDevelopers")
                .retrieve()
                .bodyToMono(GetDevelopersResponse.class)
                .block();

        return response;
    }
    /**
     * Method to get game.
     *
     * @param request request
     * @return response
     */
    public GetGameResponse getGame(GetGameRequest request) {

        GetGameResponse response = webClient.get()
                .uri("/library/game/getGame/" + request.getGameId())
                .retrieve()
                .bodyToMono(GetGameResponse.class)
                .block();

        return response;
    }
    /**
     * Method to get games.
     *
     * @param request request
     * @return response
     */
    public GetGamesResponse getGames(GetGamesRequest request) {

        GetGamesResponse response = webClient.get()
                .uri("/library/game/getGames")
                .retrieve()
                .bodyToMono(GetGamesResponse.class)
                .block();

        return response;
    }
    /**
     * Method to get library.
     *
     * @param request request
     * @return response
     */
    public GetLibraryResponse getLibrary(GetLibraryRequest request) {

        GetLibraryResponse response = webClient.get()
                .uri("/library/getLibrary/" + request.getUserId())
                .retrieve()
                .bodyToMono(GetLibraryResponse.class)
                .block();

        return response;
    }
    /**
     * Method to get library user.
     *
     * @param request request
     * @return response
     */
    public GetLibraryUserResponse getLibraryUser(GetLibraryUserRequest request) {

        GetLibraryUserResponse response = webClient.get()
                .uri("/library/getLibraryUser/" + request.getUserId())
                .retrieve()
                .bodyToMono(GetLibraryUserResponse.class)
                .block();

        return response;
    }
    /**
     * Method to get user.
     *
     * @param request request
     * @return response
     */
    public GetUserResponse getUser(GetUserRequest request) {

        GetUserResponse response = webClient.get()
                .uri("/library/user/getUser/" + request.getUserId())
                .retrieve()
                .bodyToMono(GetUserResponse.class)
                .block();

        return response;
    }
    /**
     * Method to get users.
     *
     * @param request request
     * @return response
     */
    public GetUsersResponse getUsers(GetUsersRequest request) {

        GetUsersResponse response = webClient.get()
                .uri("/library/user/getUsers")
                .retrieve()
                .bodyToMono(GetUsersResponse.class)
                .block();

        return response;
    }
    /**
     * Method to remove category.
     *
     * @param request request
     * @return response
     */
    public RemoveCategoryResponse removeCategory(RemoveCategoryRequest request) {

        RemoveCategoryResponse response = webClient.delete()
                .uri("/library/game/category/removeCategory/" + request.getCategoryId())
                .retrieve()
                .bodyToMono(RemoveCategoryResponse.class)
                .block();

        return response;
    }
    /**
     * Method to remove developer.
     *
     * @param request request
     * @return response
     */
    public RemoveDeveloperResponse removeDeveloper(RemoveDeveloperRequest request) {

        RemoveDeveloperResponse response = webClient.delete()
                .uri("/library/game/developer/removeDeveloper/" + request.getDeveloperId())
                .retrieve()
                .bodyToMono(RemoveDeveloperResponse.class)
                .block();

        return response;
    }
    /**
     * Method to remove game.
     *
     * @param request request
     * @return response
     */
    public RemoveGameResponse removeGame(RemoveGameRequest request) {

        RemoveGameResponse response = webClient.delete()
                .uri("/library/game/removeGame/" + request.getGameId())
                .retrieve()
                .bodyToMono(RemoveGameResponse.class)
                .block();

        return response;
    }
    /**
     * Method to remove item from library.
     *
     * @param request request
     * @return response
     */
    public RemoveItemFromLibraryResponse removeItemFromLibrary(RemoveItemFromLibraryRequest request) {

        RemoveItemFromLibraryResponse response = webClient.delete()
                .uri("/library/removeItemFromLibrary/" + request.getUserId() + "/" + request.getGameId())
                .retrieve()
                .bodyToMono(RemoveItemFromLibraryResponse.class)
                .block();

        return response;
    }
    /**
     * Method to remove user.
     *
     * @param request request
     * @return response
     */
    public RemoveUserResponse removeUser(RemoveUserRequest request) {

        RemoveUserResponse response = webClient.delete()
                .uri("/library/user/removeUser/" + request.getUserId())
                .retrieve()
                .bodyToMono(RemoveUserResponse.class)
                .block();

        return response;
    }
    /**
     * Method to update category.
     *
     * @param request request
     * @return response
     */
    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) {

        UpdateCategoryResponse response = webClient.put()
                .uri("/library/game/category/updateCategory")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(UpdateCategoryResponse.class)
                .block();

        return response;
    }
    /**
     * Method to update developer.
     *
     * @param request request
     * @return response
     */
    public UpdateDeveloperResponse updateDeveloper(UpdateDeveloperRequest request) {

        UpdateDeveloperResponse response = webClient.put()
                .uri("/library/game/developer/updateDeveloper")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(UpdateDeveloperResponse.class)
                .block();

        return response;
    }
    /**
     * Method to update game.
     *
     * @param request request
     * @return response
     */
    public UpdateGameResponse updateGame(UpdateGameRequest request) {

        UpdateGameResponse response = webClient.put()
                .uri("/library/game/updateGame")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(UpdateGameResponse.class)
                .block();

        return response;
    }
    /**
     * Method to update user.
     *
     * @param request request
     * @return response
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {

        UpdateUserResponse response = webClient.put()
                .uri("/library/user/updateUser")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(UpdateUserResponse.class)
                .block();

        return response;
    }
}
