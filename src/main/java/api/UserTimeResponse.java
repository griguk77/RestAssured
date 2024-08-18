package api;

public class UserTimeResponse extends UserTime {

    private String updatedAt;

    public UserTimeResponse() {
        super();
    }

    public UserTimeResponse(String name, String job, String updatedAt) {
        super(name, job);
        this.updatedAt = updatedAt;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getJob() {
        return super.getJob();
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
