package gg.lode.leadapi;

/**
 * Static accessor for the Lead API implementation.
 * Use {@link #getApi()} to retrieve the API instance for team management operations.
 */
public class LeadAPI {

    /**
     * The current {@link ILeadAPI} implementation instance.
     */
    private static ILeadAPI api;

    /**
     * Sets the {@link ILeadAPI} implementation instance.
     * This should be called during plugin initialization to inject the Paper implementation.
     *
     * @param api The {@link ILeadAPI} implementation to use.
     */
    public static void setApi(ILeadAPI api) {
        LeadAPI.api = api;
    }

    /**
     * Retrieves the {@link ILeadAPI} implementation instance.
     *
     * @return The current {@link ILeadAPI} implementation.
     */
    public static ILeadAPI getApi() {
        return api;
    }
}
