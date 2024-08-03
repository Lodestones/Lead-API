package to.lodestone.leadapi;

public class LeadAPI {

    private static ILeadAPI api;

    public static void setApi(ILeadAPI api) {
        LeadAPI.api = api;
    }

    public static ILeadAPI getApi() {
        return api;
    }
}
