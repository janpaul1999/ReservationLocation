package LocationContext.domain;

import java.util.List;

public class Location {
    private Long locationId;
    private String name;
    private boolean parking;
    private boolean currentlyUsable;
    private List<Company> companyList;
    private List<ContactInfo> contactInfoList;
    private Address address;
}
