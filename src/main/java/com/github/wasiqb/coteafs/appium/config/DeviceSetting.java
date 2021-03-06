/**
 * Copyright (c) 2017, Wasiq Bhamla.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wasiqb.coteafs.appium.config;

import static java.lang.String.format;

/**
 * @author wasiq.bhamla
 * @since 12-Apr-2017 8:34:28 PM
 */
public class DeviceSetting {
	private int				adbPort;
	private String			agentPath;
	private long			apkInstallTimeout;
	private String			appActivity;
	private String			appLocation;
	private String			appName;
	private String			appPackage;
	private ApplicationType	appType;
	private String			appWaitActivity;
	private String			appWaitPackage;
	private long			appWaitTimeout;
	private boolean			autoAcceptAlerts;
	private boolean			autoDismissAlerts;
	private boolean			autoGrantPermissions;
	private AutomationName	automationName;
	private String			avd;
	private long			avdLaunchTimeout;
	private long			avdReadyTimeout;
	private String			bootstrapPath;
	private Browser			browser;
	private String			bundleId;
	private String			chromeDriverPath;
	private boolean			clearSystemFiles;
	private int				defaultWait;
	private int				delayAfterSwipe;
	private int				delayAfterTap;
	private int				delayBeforeSwipe;
	private int				delayBeforeTap;
	private String			deviceName;
	private int				deviceReadyTimeout;
	private DeviceType		deviceType;
	private String			deviceVersion;
	private boolean			eventTimings;
	private boolean			externalApp;
	private boolean			fullReset;
	private long			keyTypingDelay;
	private long			launchTimeout;
	private boolean			noReset;
	private PlatformType	platformType;
	private boolean			screenshotOnError;
	private String			screenShotPath;
	private String			screenShotPrefix;
	private int				sessionTimeout;
	private boolean			showXcodeLog;
	private String			signingId;
	private int				systemPort;
	private String			teamId;
	private String			udid;
	private String			updatedWdaBundleId;
	private boolean			useNewWda;
	private boolean			usePrebuiltWda;
	private int				waitForElementUntil;
	private long			wdaConnectionTimeout;
	private int				wdaStartupRetries;
	private long			wdaStartupRetryInterval;

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:21:26 PM
	 */
	public DeviceSetting () {
		this.automationName = AutomationName.APPIUM;
		this.platformType = PlatformType.ANDROID;
		this.appType = ApplicationType.NATIVE;
		this.deviceType = DeviceType.REAL;
		this.defaultWait = 30;
		this.waitForElementUntil = 30;
		this.noReset = false;
		this.fullReset = false;
		this.externalApp = false;
		this.clearSystemFiles = false;
		this.sessionTimeout = 120;
		this.useNewWda = false;
		this.usePrebuiltWda = false;
		this.delayBeforeTap = 0;
		this.delayAfterTap = 0;
		this.delayBeforeSwipe = 0;
		this.delayAfterSwipe = 0;
		this.screenShotPath = format ("%s/screenshots", System.getProperty ("user.dir"));
		this.screenShotPrefix = "SCR";
		this.showXcodeLog = false;
		this.screenshotOnError = false;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the adbPort
	 */
	public int getAdbPort () {
		return this.adbPort;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @return the agentPath
	 */
	public String getAgentPath () {
		return this.agentPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the apkInstallTimeout
	 */
	public long getApkInstallTimeout () {
		return this.apkInstallTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:48 PM
	 * @return the appActivity
	 */
	public String getAppActivity () {
		return this.appActivity;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:48 PM
	 * @return the appLocation
	 */
	public String getAppLocation () {
		return this.appLocation;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:29:30 PM
	 * @return the appName
	 */
	public String getAppName () {
		return this.appName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the appPackage
	 */
	public String getAppPackage () {
		return this.appPackage;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the appType
	 */
	public ApplicationType getAppType () {
		return this.appType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 17-Apr-2017 9:23:00 PM
	 * @return the appWaitActivity
	 */
	public String getAppWaitActivity () {
		return this.appWaitActivity;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the appWaitPackage
	 */
	public String getAppWaitPackage () {
		return this.appWaitPackage;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the appWaitTimeout
	 */
	public long getAppWaitTimeout () {
		return this.appWaitTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @return the automationName
	 */
	public AutomationName getAutomationName () {
		return this.automationName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Aug 1, 2017 4:43:20 PM
	 * @return the avd
	 */
	public String getAvd () {
		return this.avd;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Aug 1, 2017 4:43:20 PM
	 * @return the avdLaunchTimeout
	 */
	public long getAvdLaunchTimeout () {
		return this.avdLaunchTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Aug 1, 2017 4:43:20 PM
	 * @return the avdReadyTimeout
	 */
	public long getAvdReadyTimeout () {
		return this.avdReadyTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @return the bootstrapPath
	 */
	public String getBootstrapPath () {
		return this.bootstrapPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Jul 15, 2017 5:05:42 PM
	 * @return the browser
	 */
	public Browser getBrowser () {
		return this.browser;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @return the bundleId
	 */
	public String getBundleId () {
		return this.bundleId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the chromeDriverPath
	 */
	public String getChromeDriverPath () {
		return this.chromeDriverPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 07-May-2017 4:23:27 PM
	 * @return the defaultWait
	 */
	public int getDefaultWait () {
		return this.defaultWait;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 3:05:58 PM
	 * @return the delayAfterSwipe
	 */
	public int getDelayAfterSwipe () {
		return this.delayAfterSwipe;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 3:05:58 PM
	 * @return the delayAfterTap
	 */
	public int getDelayAfterTap () {
		return this.delayAfterTap;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 3:05:58 PM
	 * @return the delayBeforeSwipe
	 */
	public int getDelayBeforeSwipe () {
		return this.delayBeforeSwipe;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 3:05:58 PM
	 * @return the delayBeforeTap
	 */
	public int getDelayBeforeTap () {
		return this.delayBeforeTap;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the deviceName
	 */
	public String getDeviceName () {
		return this.deviceName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the deviceReadyTimeout
	 */
	public int getDeviceReadyTimeout () {
		return this.deviceReadyTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Aug 1, 2017 3:57:48 PM
	 * @return the deviceType
	 */
	public DeviceType getDeviceType () {
		return this.deviceType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the deviceVersion
	 */
	public String getDeviceVersion () {
		return this.deviceVersion;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the keyTypingDelay
	 */
	public long getKeyTypingDelay () {
		return this.keyTypingDelay;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the launchTimeout
	 */
	public long getLaunchTimeout () {
		return this.launchTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the deviceType
	 */
	public PlatformType getPlatformType () {
		return this.platformType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 9:26:37 PM
	 * @return the screenShotPath
	 */
	public String getScreenShotPath () {
		return this.screenShotPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 9:26:37 PM
	 * @return the screenShotPrefix
	 */
	public String getScreenShotPrefix () {
		return this.screenShotPrefix;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 7:59:42 PM
	 * @return the sessionTimeout
	 */
	public int getSessionTimeout () {
		return this.sessionTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-May-2017 7:08:19 PM
	 * @return the signingId
	 */
	public String getSigningId () {
		return this.signingId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the systemPort
	 */
	public int getSystemPort () {
		return this.systemPort;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-May-2017 7:08:19 PM
	 * @return the teamId
	 */
	public String getTeamId () {
		return this.teamId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @return the udid
	 */
	public String getUdid () {
		return this.udid;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 23-May-2017 4:02:32 PM
	 * @return the updatedWdaBundleId
	 */
	public String getUpdatedWdaBundleId () {
		return this.updatedWdaBundleId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 07-May-2017 4:23:27 PM
	 * @return the waitForElementUntil
	 */
	public int getWaitForElementUntil () {
		return this.waitForElementUntil;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 16-May-2017 6:10:56 PM
	 * @return the wdaConnectionTimeout
	 */
	public long getWdaConnectionTimeout () {
		return this.wdaConnectionTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the wdaStartupRetries
	 */
	public int getWdaStartupRetries () {
		return this.wdaStartupRetries;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the wdaStartupRetryInterval
	 */
	public long getWdaStartupRetryInterval () {
		return this.wdaStartupRetryInterval;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the autoAcceptAlerts
	 */
	public boolean isAutoAcceptAlerts () {
		return this.autoAcceptAlerts;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the autoDismissAlerts
	 */
	public boolean isAutoDismissAlerts () {
		return this.autoDismissAlerts;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the autoGrantPermissions
	 */
	public boolean isAutoGrantPermissions () {
		return this.autoGrantPermissions;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 23-May-2017 4:45:23 PM
	 * @return the clearSystemFiles
	 */
	public boolean isClearSystemFiles () {
		return this.clearSystemFiles;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @return the eventTimings
	 */
	public boolean isEventTimings () {
		return this.eventTimings;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 30-Apr-2017 8:00:43 PM
	 * @return the externalApp
	 */
	public boolean isExternalApp () {
		return this.externalApp;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 3:16:16 PM
	 * @return the fullReset
	 */
	public boolean isFullReset () {
		return this.fullReset;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 3:16:16 PM
	 * @return the noReset
	 */
	public boolean isNoReset () {
		return this.noReset;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Dec 4, 2017 2:58:54 PM
	 * @return the screenshotOnError
	 */
	public boolean isScreenshotOnError () {
		return this.screenshotOnError;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 2, 2017 8:08:07 PM
	 * @return the showXcodeLog
	 */
	public boolean isShowXcodeLog () {
		return this.showXcodeLog;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 23-May-2017 6:33:48 PM
	 * @return the useNewWda
	 */
	public boolean isUseNewWda () {
		return this.useNewWda;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 23-May-2017 6:54:33 PM
	 * @return the usePrebuiltWda
	 */
	public boolean isUsePrebuiltWda () {
		return this.usePrebuiltWda;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param adbPort
	 *            the adbPort to set
	 */
	public void setAdbPort (final int adbPort) {
		this.adbPort = adbPort;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @param agentPath
	 *            the agentPath to set
	 */
	public void setAgentPath (final String agentPath) {
		this.agentPath = agentPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param apkInstallTimeout
	 *            the apkInstallTimeout to set
	 */
	public void setApkInstallTimeout (final long apkInstallTimeout) {
		this.apkInstallTimeout = apkInstallTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:48 PM
	 * @param appActivity
	 *            the appActivity to set
	 */
	public void setAppActivity (final String appActivity) {
		this.appActivity = appActivity;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param appLocation
	 *            the appLocation to set
	 */
	public void setAppLocation (final String appLocation) {
		this.appLocation = appLocation;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:29:30 PM
	 * @param appName
	 *            the appName to set
	 */
	public void setAppName (final String appName) {
		this.appName = appName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param appPackage
	 *            the appPackage to set
	 */
	public void setAppPackage (final String appPackage) {
		this.appPackage = appPackage;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param appType
	 *            the appType to set
	 */
	public void setAppType (final ApplicationType appType) {
		this.appType = appType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 17-Apr-2017 9:23:00 PM
	 * @param appWaitActivity
	 *            the appWaitActivity to set
	 */
	public void setAppWaitActivity (final String appWaitActivity) {
		this.appWaitActivity = appWaitActivity;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param appWaitPackage
	 *            the appWaitPackage to set
	 */
	public void setAppWaitPackage (final String appWaitPackage) {
		this.appWaitPackage = appWaitPackage;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param appWaitTimeout
	 *            the appWaitTimeout to set
	 */
	public void setAppWaitTimeout (final long appWaitTimeout) {
		this.appWaitTimeout = appWaitTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param autoAcceptAlerts
	 *            the autoAcceptAlerts to set
	 */
	public void setAutoAcceptAlerts (final boolean autoAcceptAlerts) {
		this.autoAcceptAlerts = autoAcceptAlerts;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param autoDismissAlerts
	 *            the autoDismissAlerts to set
	 */
	public void setAutoDismissAlerts (final boolean autoDismissAlerts) {
		this.autoDismissAlerts = autoDismissAlerts;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param autoGrantPermissions
	 *            the autoGrantPermissions to set
	 */
	public void setAutoGrantPermissions (final boolean autoGrantPermissions) {
		this.autoGrantPermissions = autoGrantPermissions;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @param automationName
	 *            the automationName to set
	 */
	public void setAutomationName (final AutomationName automationName) {
		this.automationName = automationName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Aug 1, 2017 4:43:20 PM
	 * @param avd
	 *            the avd to set
	 */
	public void setAvd (final String avd) {
		this.avd = avd;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Aug 1, 2017 4:43:20 PM
	 * @param avdLaunchTimeout
	 *            the avdLaunchTimeout to set
	 */
	public void setAvdLaunchTimeout (final long avdLaunchTimeout) {
		this.avdLaunchTimeout = avdLaunchTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Aug 1, 2017 4:43:20 PM
	 * @param avdReadyTimeout
	 *            the avdReadyTimeout to set
	 */
	public void setAvdReadyTimeout (final long avdReadyTimeout) {
		this.avdReadyTimeout = avdReadyTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @param bootstrapPath
	 *            the bootstrapPath to set
	 */
	public void setBootstrapPath (final String bootstrapPath) {
		this.bootstrapPath = bootstrapPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Jul 15, 2017 5:05:42 PM
	 * @param browser
	 *            the browser to set
	 */
	public void setBrowser (final Browser browser) {
		this.browser = browser;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 24-Apr-2017 9:15:54 PM
	 * @param bundleId
	 *            the bundleId to set
	 */
	public void setBundleId (final String bundleId) {
		this.bundleId = bundleId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param chromeDriverPath
	 *            the chromeDriverPath to set
	 */
	public void setChromeDriverPath (final String chromeDriverPath) {
		this.chromeDriverPath = chromeDriverPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 23-May-2017 4:45:23 PM
	 * @param clearSystemFiles
	 *            the clearSystemFiles to set
	 */
	public void setClearSystemFiles (final boolean clearSystemFiles) {
		this.clearSystemFiles = clearSystemFiles;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 07-May-2017 4:23:27 PM
	 * @param defaultWait
	 *            the defaultWait to set
	 */
	public void setDefaultWait (final int defaultWait) {
		this.defaultWait = defaultWait;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 3:05:58 PM
	 * @param delayAfterSwipe
	 *            the delayAfterSwipe to set
	 */
	public void setDelayAfterSwipe (final int delayAfterSwipe) {
		this.delayAfterSwipe = delayAfterSwipe;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 3:05:58 PM
	 * @param delayAfterTap
	 *            the delayAfterTap to set
	 */
	public void setDelayAfterTap (final int delayAfterTap) {
		this.delayAfterTap = delayAfterTap;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 3:05:58 PM
	 * @param delayBeforeSwipe
	 *            the delayBeforeSwipe to set
	 */
	public void setDelayBeforeSwipe (final int delayBeforeSwipe) {
		this.delayBeforeSwipe = delayBeforeSwipe;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 3:05:58 PM
	 * @param delayBeforeTap
	 *            the delayBeforeTap to set
	 */
	public void setDelayBeforeTap (final int delayBeforeTap) {
		this.delayBeforeTap = delayBeforeTap;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param deviceName
	 *            the deviceName to set
	 */
	public void setDeviceName (final String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param deviceReadyTimeout
	 *            the deviceReadyTimeout to set
	 */
	public void setDeviceReadyTimeout (final int deviceReadyTimeout) {
		this.deviceReadyTimeout = deviceReadyTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Aug 1, 2017 3:57:48 PM
	 * @param deviceType
	 *            the deviceType to set
	 */
	public void setDeviceType (final DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param deviceVersion
	 *            the deviceVersion to set
	 */
	public void setDeviceVersion (final String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param eventTimings
	 *            the eventTimings to set
	 */
	public void setEventTimings (final boolean eventTimings) {
		this.eventTimings = eventTimings;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 30-Apr-2017 8:00:43 PM
	 * @param externalApp
	 *            the externalApp to set
	 */
	public void setExternalApp (final boolean externalApp) {
		this.externalApp = externalApp;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 3:16:16 PM
	 * @param fullReset
	 *            the fullReset to set
	 */
	public void setFullReset (final boolean fullReset) {
		this.fullReset = fullReset;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param keyTypingDelay
	 *            the keyTypingDelay to set
	 */
	public void setKeyTypingDelay (final long keyTypingDelay) {
		this.keyTypingDelay = keyTypingDelay;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param launchTimeout
	 *            the launchTimeout to set
	 */
	public void setLaunchTimeout (final long launchTimeout) {
		this.launchTimeout = launchTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 3:16:16 PM
	 * @param noReset
	 *            the noReset to set
	 */
	public void setNoReset (final boolean noReset) {
		this.noReset = noReset;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param deviceType
	 *            the deviceType to set
	 */
	public void setPlatformType (final PlatformType deviceType) {
		this.platformType = deviceType;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Dec 4, 2017 2:58:54 PM
	 * @param screenshotOnError
	 *            the screenshotOnError to set
	 */
	public void setScreenshotOnError (final boolean screenshotOnError) {
		this.screenshotOnError = screenshotOnError;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 9:26:37 PM
	 * @param screenShotPath
	 *            the screenShotPath to set
	 */
	public void setScreenShotPath (final String screenShotPath) {
		this.screenShotPath = screenShotPath;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 9, 2017 9:26:37 PM
	 * @param screenShotPrefix
	 *            the screenShotPrefix to set
	 */
	public void setScreenShotPrefix (final String screenShotPrefix) {
		this.screenShotPrefix = screenShotPrefix;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 08-May-2017 7:59:42 PM
	 * @param sessionTimeout
	 *            the sessionTimeout to set
	 */
	public void setSessionTimeout (final int sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 2, 2017 8:08:07 PM
	 * @param showXcodeLog
	 *            the showXcodeLog to set
	 */
	public void setShowXcodeLog (final boolean showXcodeLog) {
		this.showXcodeLog = showXcodeLog;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-May-2017 7:08:19 PM
	 * @param signingId
	 *            the signingId to set
	 */
	public void setSigningId (final String signingId) {
		this.signingId = signingId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param systemPort
	 *            the systemPort to set
	 */
	public void setSystemPort (final int systemPort) {
		this.systemPort = systemPort;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-May-2017 7:08:19 PM
	 * @param teamId
	 *            the teamId to set
	 */
	public void setTeamId (final String teamId) {
		this.teamId = teamId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 12-Apr-2017 8:42:49 PM
	 * @param udid
	 *            the udid to set
	 */
	public void setUdid (final String udid) {
		this.udid = udid;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 23-May-2017 4:02:32 PM
	 * @param updatedWdaBundleId
	 *            the updatedWdaBundleId to set
	 */
	public void setUpdatedWdaBundleId (final String updatedWdaBundleId) {
		this.updatedWdaBundleId = updatedWdaBundleId;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 23-May-2017 6:33:48 PM
	 * @param useNewWda
	 *            the useNewWda to set
	 */
	public void setUseNewWda (final boolean useNewWda) {
		this.useNewWda = useNewWda;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 23-May-2017 6:54:33 PM
	 * @param usePrebuiltWda
	 *            the usePrebuiltWda to set
	 */
	public void setUsePrebuiltWda (final boolean usePrebuiltWda) {
		this.usePrebuiltWda = usePrebuiltWda;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 07-May-2017 4:23:28 PM
	 * @param waitForElementUntil
	 *            the waitForElementUntil to set
	 */
	public void setWaitForElementUntil (final int waitForElementUntil) {
		this.waitForElementUntil = waitForElementUntil;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 16-May-2017 6:10:56 PM
	 * @param wdaConnectionTimeout
	 *            the wdaConnectionTimeout to set
	 */
	public void setWdaConnectionTimeout (final long wdaConnectionTimeout) {
		this.wdaConnectionTimeout = wdaConnectionTimeout;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param wdaStartupRetries
	 *            the wdaStartupRetries to set
	 */
	public void setWdaStartupRetries (final int wdaStartupRetries) {
		this.wdaStartupRetries = wdaStartupRetries;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Nov 19, 2017 9:54:14 PM
	 * @param wdaStartupRetryInterval
	 *            the wdaStartupRetryInterval to set
	 */
	public void setWdaStartupRetryInterval (final long wdaStartupRetryInterval) {
		this.wdaStartupRetryInterval = wdaStartupRetryInterval;
	}
}