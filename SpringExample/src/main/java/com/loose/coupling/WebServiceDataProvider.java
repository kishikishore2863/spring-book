package com.loose.coupling;

public class WebServiceDataProvider  implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "fetching data from web service";
    }
}
