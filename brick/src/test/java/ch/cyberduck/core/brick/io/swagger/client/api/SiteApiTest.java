/*
 * Files.com API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: support@files.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.brick.io.swagger.client.api;

import ch.cyberduck.core.brick.io.swagger.client.ApiException;
import ch.cyberduck.core.brick.io.swagger.client.model.ApiKeyEntity;
import org.joda.time.DateTime;
import ch.cyberduck.core.brick.io.swagger.client.model.DnsRecordEntity;
import java.io.File;
import ch.cyberduck.core.brick.io.swagger.client.model.IpAddressEntity;
import ch.cyberduck.core.brick.io.swagger.client.model.SiteEntity;
import ch.cyberduck.core.brick.io.swagger.client.model.StatusEntity;
import ch.cyberduck.core.brick.io.swagger.client.model.UsageSnapshotEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SiteApi
 */
@Ignore
public class SiteApiTest {

    private final SiteApi api = new SiteApi();

    
    /**
     * Show site settings
     *
     * Show site settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSiteTest() throws ApiException {
        SiteEntity response = api.getSite();

        // TODO: test validations
    }
    
    /**
     * List Api Keys
     *
     * List Api Keys
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSiteApiKeysTest() throws ApiException {
        Integer userId = null;
        String cursor = null;
        Integer perPage = null;
        Map<String, String> sortBy = null;
        Map<String, String> filter = null;
        Map<String, String> filterGt = null;
        Map<String, String> filterGteq = null;
        Map<String, String> filterLike = null;
        Map<String, String> filterLt = null;
        Map<String, String> filterLteq = null;
        List<ApiKeyEntity> response = api.getSiteApiKeys(userId, cursor, perPage, sortBy, filter, filterGt, filterGteq, filterLike, filterLt, filterLteq);

        // TODO: test validations
    }
    
    /**
     * Show site DNS configuration.
     *
     * Show site DNS configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSiteDnsRecordsTest() throws ApiException {
        String cursor = null;
        Integer perPage = null;
        List<DnsRecordEntity> response = api.getSiteDnsRecords(cursor, perPage);

        // TODO: test validations
    }
    
    /**
     * List IP Addresses associated with the current site
     *
     * List IP Addresses associated with the current site
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSiteIpAddressesTest() throws ApiException {
        String cursor = null;
        Integer perPage = null;
        List<IpAddressEntity> response = api.getSiteIpAddresses(cursor, perPage);

        // TODO: test validations
    }
    
    /**
     * Get the most recent usage snapshot (usage data for billing purposes) for a Site.
     *
     * Get the most recent usage snapshot (usage data for billing purposes) for a Site.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSiteUsageTest() throws ApiException {
        UsageSnapshotEntity response = api.getSiteUsage();

        // TODO: test validations
    }
    
    /**
     * Update site settings.
     *
     * Update site settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchSiteTest() throws ApiException {
        String name = null;
        String subdomain = null;
        String domain = null;
        String email = null;
        String replyToEmail = null;
        Boolean allowBundleNames = null;
        Integer bundleExpiration = null;
        Boolean overageNotify = null;
        Boolean welcomeEmailEnabled = null;
        Boolean askAboutOverwrites = null;
        Boolean showRequestAccessLink = null;
        String welcomeEmailCc = null;
        String welcomeCustomText = null;
        String language = null;
        Boolean windowsModeFtp = null;
        String defaultTimeZone = null;
        Boolean desktopApp = null;
        Boolean desktopAppSessionIpPinning = null;
        Integer desktopAppSessionLifetime = null;
        Boolean folderPermissionsGroupsOnly = null;
        String welcomeScreen = null;
        Boolean officeIntegrationAvailable = null;
        Double sessionExpiry = null;
        Boolean sslRequired = null;
        Boolean tlsDisabled = null;
        Boolean userLockout = null;
        Integer userLockoutTries = null;
        Integer userLockoutWithin = null;
        Integer userLockoutLockPeriod = null;
        Boolean includePasswordInWelcomeEmail = null;
        String allowedCountries = null;
        String allowedIps = null;
        String disallowedCountries = null;
        Integer daysToRetainBackups = null;
        Integer maxPriorPasswords = null;
        Integer passwordValidityDays = null;
        Integer passwordMinLength = null;
        Boolean passwordRequireLetter = null;
        Boolean passwordRequireMixed = null;
        Boolean passwordRequireSpecial = null;
        Boolean passwordRequireNumber = null;
        Boolean passwordRequireUnbreached = null;
        Boolean sftpUserRootEnabled = null;
        Boolean disablePasswordReset = null;
        Boolean immutableFiles = null;
        Boolean sessionPinnedByIp = null;
        Boolean bundlePasswordRequired = null;
        Boolean bundleRequireShareRecipient = null;
        Boolean passwordRequirementsApplyToBundles = null;
        Boolean optOutGlobal = null;
        Boolean useProvidedModifiedAt = null;
        Boolean customNamespace = null;
        Integer disableUsersFromInactivityPeriodDays = null;
        Boolean nonSsoGroupsAllowed = null;
        Boolean nonSsoUsersAllowed = null;
        Boolean sharingEnabled = null;
        Boolean userRequestsEnabled = null;
        Boolean allowed2faMethodSms = null;
        Boolean allowed2faMethodU2f = null;
        Boolean allowed2faMethodTotp = null;
        Boolean allowed2faMethodYubi = null;
        Boolean require2fa = null;
        String require2faUserType = null;
        String color2Top = null;
        String color2Left = null;
        String color2Link = null;
        String color2Text = null;
        String color2TopText = null;
        String siteHeader = null;
        String siteFooter = null;
        String loginHelpText = null;
        String smtpAddress = null;
        String smtpAuthentication = null;
        String smtpFrom = null;
        String smtpUsername = null;
        Integer smtpPort = null;
        Boolean ldapEnabled = null;
        String ldapType = null;
        String ldapHost = null;
        String ldapHost2 = null;
        String ldapHost3 = null;
        Integer ldapPort = null;
        Boolean ldapSecure = null;
        String ldapUsername = null;
        String ldapUsernameField = null;
        String ldapDomain = null;
        String ldapUserAction = null;
        String ldapGroupAction = null;
        String ldapUserIncludeGroups = null;
        String ldapGroupExclusion = null;
        String ldapGroupInclusion = null;
        String ldapBaseDn = null;
        File icon16File = null;
        Boolean icon16Delete = null;
        File icon32File = null;
        Boolean icon32Delete = null;
        File icon48File = null;
        Boolean icon48Delete = null;
        File icon128File = null;
        Boolean icon128Delete = null;
        File logoFile = null;
        Boolean logoDelete = null;
        Boolean disable2faWithDelay = null;
        String ldapPasswordChange = null;
        String ldapPasswordChangeConfirmation = null;
        String smtpPassword = null;
        SiteEntity response = api.patchSite(name, subdomain, domain, email, replyToEmail, allowBundleNames, bundleExpiration, overageNotify, welcomeEmailEnabled, askAboutOverwrites, showRequestAccessLink, welcomeEmailCc, welcomeCustomText, language, windowsModeFtp, defaultTimeZone, desktopApp, desktopAppSessionIpPinning, desktopAppSessionLifetime, folderPermissionsGroupsOnly, welcomeScreen, officeIntegrationAvailable, sessionExpiry, sslRequired, tlsDisabled, userLockout, userLockoutTries, userLockoutWithin, userLockoutLockPeriod, includePasswordInWelcomeEmail, allowedCountries, allowedIps, disallowedCountries, daysToRetainBackups, maxPriorPasswords, passwordValidityDays, passwordMinLength, passwordRequireLetter, passwordRequireMixed, passwordRequireSpecial, passwordRequireNumber, passwordRequireUnbreached, sftpUserRootEnabled, disablePasswordReset, immutableFiles, sessionPinnedByIp, bundlePasswordRequired, bundleRequireShareRecipient, passwordRequirementsApplyToBundles, optOutGlobal, useProvidedModifiedAt, customNamespace, disableUsersFromInactivityPeriodDays, nonSsoGroupsAllowed, nonSsoUsersAllowed, sharingEnabled, userRequestsEnabled, allowed2faMethodSms, allowed2faMethodU2f, allowed2faMethodTotp, allowed2faMethodYubi, require2fa, require2faUserType, color2Top, color2Left, color2Link, color2Text, color2TopText, siteHeader, siteFooter, loginHelpText, smtpAddress, smtpAuthentication, smtpFrom, smtpUsername, smtpPort, ldapEnabled, ldapType, ldapHost, ldapHost2, ldapHost3, ldapPort, ldapSecure, ldapUsername, ldapUsernameField, ldapDomain, ldapUserAction, ldapGroupAction, ldapUserIncludeGroups, ldapGroupExclusion, ldapGroupInclusion, ldapBaseDn, icon16File, icon16Delete, icon32File, icon32Delete, icon48File, icon48Delete, icon128File, icon128Delete, logoFile, logoDelete, disable2faWithDelay, ldapPasswordChange, ldapPasswordChangeConfirmation, smtpPassword);

        // TODO: test validations
    }
    
    /**
     * Create Api Key
     *
     * Create Api Key
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSiteApiKeysTest() throws ApiException {
        Integer userId = null;
        String name = null;
        DateTime expiresAt = null;
        String permissionSet = null;
        String path = null;
        ApiKeyEntity response = api.postSiteApiKeys(userId, name, expiresAt, permissionSet, path);

        // TODO: test validations
    }
    
    /**
     * Test webhook.
     *
     * Test webhook.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSiteTestWebhookTest() throws ApiException {
        String url = null;
        String method = null;
        String encoding = null;
        Map<String, String> headers = null;
        Map<String, String> body = null;
        String action = null;
        StatusEntity response = api.postSiteTestWebhook(url, method, encoding, headers, body, action);

        // TODO: test validations
    }
    
}
