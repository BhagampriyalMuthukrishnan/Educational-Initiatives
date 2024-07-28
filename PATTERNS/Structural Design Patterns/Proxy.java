
interface LibrarySection {
    void accessSection();
}

class RestrictedSection implements LibrarySection {
    private String sectionName;

    public RestrictedSection(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public void accessSection() {
        System.out.println("Accessing restricted section: " + sectionName);
    }
}

// Proxy Class
class LibraryAccessProxy implements LibrarySection {
    private RestrictedSection restrictedSection;
    private String userMembershipLevel;

    public LibraryAccessProxy(String userMembershipLevel, String sectionName) {
        this.userMembershipLevel = userMembershipLevel;
        this.restrictedSection = new RestrictedSection(sectionName);
    }

    @Override
    public void accessSection() {
        if (userMembershipLevel.equalsIgnoreCase("premium")) {
            restrictedSection.accessSection();
        } else {
            System.out.println("Access denied: Premium membership required to access this section.");
        }
    }
}

// Main class to demonstrate Proxy Pattern
public class Proxy {
    public static void main(String[] args) {
        LibrarySection premiumUserAccess = new LibraryAccessProxy("premium", "Rare Books");
        LibrarySection regularUserAccess = new LibraryAccessProxy("regular", "Rare Books");

        // Premium user can access the restricted section
        premiumUserAccess.accessSection();

        // Regular user cannot access the restricted section
        regularUserAccess.accessSection();
    }
}
