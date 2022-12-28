package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;

import personal.model.Repository;
import personal.model.RepositoryFileAnother;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperationNew = new FileOperationImpl("Seminar_5/usersNew.txt");
        Repository repositoryAnother = new RepositoryFileAnother(fileOperationNew);
        UserController controllerAnother = new UserController(repositoryAnother);
        ViewUser view = new ViewUser(controllerAnother);
        view.run();
    }
}
