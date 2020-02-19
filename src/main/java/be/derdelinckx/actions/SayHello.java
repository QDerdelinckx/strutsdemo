package be.derdelinckx.actions;

import com.opensymphony.xwork2.ActionSupport;

public class SayHello extends ActionSupport {

    private String name;
    private String message;

    @Override
    public String execute() throws Exception{
        setMessage("Tu as réussi !");
        return "success";
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
