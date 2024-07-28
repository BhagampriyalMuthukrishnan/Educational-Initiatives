//Strategy Method
interface AuthenticationStrategy {
    boolean authenticate(String username, String credential);
}

class PasswordAuthentication implements AuthenticationStrategy {
    @Override
    public boolean authenticate(String username, String password) {
        // Example authentication logic for password
        System.out.println("Authenticating using Password for user: " + username);
        // In real scenario, you'd check the password against a database
        return password.equals("userpassword");
    }
}

class TwoFactorAuthentication implements AuthenticationStrategy {
    @Override
    public boolean authenticate(String username, String code) {
        // Example authentication logic for 2FA
        System.out.println("Authenticating using Two-Factor Authentication for user: " + username);
        // In real scenario, you'd verify the code from an SMS or email
        return code.equals("123456");
    }
}

class BiometricAuthentication implements AuthenticationStrategy {
    @Override
    public boolean authenticate(String username, String biometricData) {
        // Example authentication logic for biometric data
        System.out.println("Authenticating using Biometric data for user: " + username);
        // In real scenario, you'd verify the biometric data (e.g., fingerprint)
        return biometricData.equals("userbiometric");
    }
}

class AuthenticationContext {
    private AuthenticationStrategy strategy;

    public void setStrategy(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean authenticate(String username, String credential) {
        return strategy.authenticate(username, credential);
    }
}

public class Authentication {
    public static void main(String[] args) {
        AuthenticationContext context = new AuthenticationContext();

        // Using Password Authentication
        context.setStrategy(new PasswordAuthentication());
        boolean isAuthenticated = context.authenticate("user1", "userpassword");
        System.out.println("Password Authentication successful: " + isAuthenticated);

        // Using Two-Factor Authentication
        context.setStrategy(new TwoFactorAuthentication());
        isAuthenticated = context.authenticate("user1", "123456");
        System.out.println("2FA Authentication successful: " + isAuthenticated);

        // Using Biometric Authentication
        context.setStrategy(new BiometricAuthentication());
        isAuthenticated = context.authenticate("user1", "userbiometric");
        System.out.println("Biometric Authentication successful: " + isAuthenticated);
    }
}
