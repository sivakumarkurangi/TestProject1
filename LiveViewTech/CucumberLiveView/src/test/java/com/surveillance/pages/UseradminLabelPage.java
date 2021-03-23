package com.surveillance.pages;
import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;
public class UseradminLabelPage  {
	PropertySingleton _instance = null;

	public UseradminLabelPage() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("UserInformationPage");
	

	   public String verifyUserAdministrations() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_UserAdministrations"));
			keywords.waitForPageLoad();
			return Data;
		}
	   public String verifyUsers() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.BTN_Users"));
			return Data;
		}
	
	   public String verifyClients() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.BTN_Clients"));
			return Data;
		}
	   public String verifyRoles() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.BTN_Roles"));
			return Data;
		}
	   public String verifyPolicies() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.BTN_Policies"));
			return Data;
		}
	   public String verifyPolicyGroups() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.BTN_PolicyGroups"));
			return Data;
		}
	   public String verifyLegend() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_Legend"));
			return Data;
		}
	   public String verifyCameraRights() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_CameraRights"));
			return Data;
		}
	   public String verifyNotifications() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_Notifications"));
			return Data;
		}
	   public String verifyResetPassword() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_ResetPassword"));
			return Data;
		}
	   public String verifyUserFilter() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_UserFilter"));
			return Data;
		}
	   public String verifyUserResultsperPage() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_UserResultsperPage"));
			return Data;
		}
	   public String verifyAllUsers() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.Radio_AllUsers"));
			return Data;
		}
	   public String verifyExpiredUsers() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.Radio_ExpiredUsers"));
			return Data;
		}
	   public String verifyNonexpiredUsers() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.Radio_NonexpiredUsers"));
			return Data;
		}
	   public String verifyEmailAddress() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_EmailAddress"));
			return Data;
		}
	   public String verifyUserName() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_UserName"));
			return Data;
		}
	   public String verifyUserClient() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_UserClient"));
			return Data;
			}
	   public String verifyUserRole() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_UserRole"));
			return Data;
			}
	   public String verifyUserActions() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_UserActions"));
			return Data;
			}
	   public String verifyAddaNewUser() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_AddaNewUser"));
			return Data;
			}
	   public String verifyAddMultipleUsers() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_AddMultipleUsers"));
			return Data;
			}
	   public String verifyAddaNewClient() throws Exception {
				String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_AddaNewClient"));
				return Data;
			}
 
        public String verifyClientFilter() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_ClientFilter"));
			return Data;
			}
        public String verifyClientResultsperPage() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_ClientResultsperPage"));
			return Data;
			}
        public String verifyClientOnlyActive() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.CheckBox_ClientOnlyActive"));
			return Data;
			}
        public String verifyClientName() throws Exception {
     			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_ClientName"));
     			return Data;
     			}
        public String verifyClientDistributor() throws Exception {
 			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_ClientDistributor"));
 			return Data;
 			}
        public String verifyClientCity() throws Exception {
 			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_ClientCity"));
 			return Data;
 			}
        public String verifyClientState() throws Exception {
 			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_ClientState"));
 			return Data;
 			}
        public String verifyClientCountry() throws Exception {
 			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_ClientCountry"));
 			return Data;
 			}
        public String verifyClientActions() throws Exception {
 			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_ClientActions"));
 			return Data;
 			}
        public String verifyRolesViewAllRoles() throws Exception {
 			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_RolesViewAllRoles"));
 			return Data;
 			}
        public String verifyRolesName() throws Exception {
 			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_RolesName"));
 			return Data;
 			}
        public String verifyRolesDescription() throws Exception {
 			String Data= keywords.getText("xpath", _instance.getValue("UseradminLabel.LBL_RolesDescription"));
 			return Data;
 			}
        public UseradminLabelPage clickonClients() 
		{
			keywords.jsClick("xpath", _instance.getValue("UseradminLabel.BTN_Clients"));
			return this;
		}
}
	   

		   
	

