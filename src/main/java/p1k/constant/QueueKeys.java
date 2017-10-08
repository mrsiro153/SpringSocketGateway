package p1k.constant;

/**
 * Created by MILA on 2/17/2017.
 */
public class QueueKeys {

    public enum Authentication_Queue {
        LOGIN_QUEUE(0, "authentication_login_queue"),
        ADMIN_LOGIN_QUEUE(1, "authentication_admin_login_queue"),
        CHECK_OTP_QUEUE(2, "authentication_check_otp_queue"),
        RESEND_VERIFY_QUEUE(3, "authentication_resend_verify_queue"),
        CREATE_BANKTEK_USER_QUEUE(4, "authentication_create_banktek_user_queue"),
        USER_GET_PAYEE(5, "authentication_get_payee_info"),
        INTERNAL_TRANSACTION_QUEUE(6, "authentication_internal_transaction_queue"),
        GET_BRANCH_CODE(7, "authentication_get_branch_code_queue"),
        TRUST_DEVICE_QUEUE(8, "trust_device_queue"),
        CHECK_USER_OTP_QUEUE(9, "authentication_check_user_queue"),
        RESEND_USER_VERIFY_QUEUE(10, "authentication_resend_user_verify_queue"),
        CREATE_OTP_QUEUE(11, "authentication_create_otp_queue"),
        GET_PAYBILL_QUEUE(12, "authentication_get_billpay_queue"),
        BALANCE_CHANGE_QUEUE(13, "balance_change_queue"),
        PAY_BILL(15, "authentication_pay_bill"),
        TOP_UP_TRANSFER_QUEUE(16, "top_up_transfer_queue"),
        USER_LOGOUT(17, "authentication_user_log_out"),
        ADMIN_LOGOUT(18, "authentication_admin_log_out"),
        GET_TOP_UP_DATA(19, "authentication_get_top_up_data"),
        UPDATE_USER_PROFIE(20, "authentication_update_user_profile_queue"),
        GET_ALL_USERS_QUICK_REGISTER_BY_ADMIN(21, "authentication_get_all_users_quick_register_by_admin"),
        GET_SPECIFIED_INFO_USER_FOR_QUICK_REGISTER(22, "authentication_get_specified_info_user_for_quick_register"),
        GET_FACEBOOK_INFO(23, "authentication_get_facebook_info_queue"),
        SYNC_FACEBOOK_ACCOUNT(23, "authentication_sync_facebook_account_queue"),
        SHARE_TO_FACEBOOK(24, "authentication_share_to_facebook"),
        AUTHENTICATION_UPDATE_USER_INFO(25, "authentication_update_user_info"),
        GET_USER_PROFILE(26, "authentication_get_user_info"),
        GET_USER_ACCOUNT(27, "authentication_get_account"),
        GET_TRANSACTION_HISTORY(28, "authentication_get_transaction_history"),
        GET_INTERNAL_INFORMATION(29, "authentication_account_or_bank_card"),
        LIST_DEVICES_INFO(26, "list_devices_info"),
        UPDATE_INFO_FOR_USER(30, "update_info_for_user"),
        UPDATE_DEVICE_INFO(31, "authentication_update_device_info"),
        GET_CARD_INFO_FROM_SIMULATION(32, "authentication_get_card_info_from_simulation"),
        REMOVE_TRUSTED_DEVICE(33, "remove_trusted_device"),
        SET_MAIN_DEVICE(34, "set_main_devices"),
        GOALS_SAVE_QUEUE(35, "authentication_goal_save"),
        TERM_DEPOSIT(36, "authentication_term_deposit"),
        GET_TERM_DEPOSIT(37, "authentication_get_term_deposit"),
        UPDATE_GOAL_SAVE(38, "authentication_update_goal_save"),
        GET_GOAL_SAVE(40, "authentication_get_goal_save"),
        UPDATE_CARD_STATUS(41, "update_card_status"),
        GET_FD_TYPE(42, "authentication_get_fd_type"),
        USER_FORGOT_SOMETHING(48, "authentication_user_forgot_something"),
        USER_SUBMIT_NEW_PASSWORD(49, "authentication_user_submit_new_password"),
        USER_GET_TOKEN_FORGOT_PASSWORD(50, "authentication_user_get_token_forgot_password"),
        REFRESH_TOKEN(44, "authentication_refresh_token_queue"),
        REFRESH_ADMIN_TOKEN(45, "authentication_refresh_admin_token_queue"),
        UPDATE_ADMIN_TOKEN_AFTER_OTP(46, "authentication_update_token_after_otp"),
        UPDATE_OTP_TOKEN(47, "authentication_update_otp_token"),
        UPDATE_USER_TOKEN(48, "authentication_update_user_token status"),
        USER_GET_SPECIFIED_TRANSACTION(49, "authentication_user_get_specified_transaction"),
        ADMIN_APPROVE_USER(50, "authentication_admin_approve_Us"),
        GET_SYSTEM_CONFIG(51, "authentication_user_get_system_config"),
        UPDATE_SYSTEM_CONFIG(52, "authentication_admin_update_system_config"),
        RECENT_TOP_UP_PHONE_NUMBER(53, "authentication_recent_phone_number"),
        GET_USER_ACCOUNT_SUGGESTION(54, "authentication_getuser_account_suggestion"),
        GET_SERVICE_QUEUE(55, "authentication_get_service_queue"),
        GET_PROVIDER_QUEUE(56, "authentication_get_provider_queue"),
        AUTO_JOIN_BANKTEK_QUEUE(57, "authentication_auto_join_banktek_queue"),
        GET_BILL_HISTORY(58, "authentication_get_bill_history"),
        WITH_DRAW_TERM_DEPOSIT(59, "authentication_with_draw_term_deposit"),
        GET_TIMELINE_BY_USER_OPTION(60, "authentication_get_time_line_by_user_option"),
        MOVE_GOAL_SAVE(61, "authentication_move_goal_save"),
        WITHDRAW_GOAL_SAVE(62, "authentication_withdraw_goal_save"),
        TRANSFER_MONEY_GROUP(64,"authentication_transfer_money_by_group"),

        TRANSFER_GOAL_SAVE(61, "authentication_move_goal_save"),
        SUGGESTION_USER_FROM_SIMULATION(63, "authentication_suggestion_user_simulation"),
        GET_TIMELINE_LIMIT_TRANSACTIONS(64, "authentication_timeline_by_quantity_of_transaction"),
        CHECK_USERNAME_EXITS(65, "authentication_check_username_exits"),
        GET_FD_ACCOUNT(66, "authentication_get_fd_account"),
        UPDATE_FD_ACCOUNT_INFO(67, "authentication_update_fd_account_info"),
        INVITE_FRIEND(68, "authentication_invite_friend"),
        GET_ALL_ACCOUNT_INFO(69,"authentication_get_all_account_term_goal_info"),

        //Admin queue for user
        ADMIN_GET_ALL_USER_QUEUE(60, "authentication_get_all_user_queue"),
        ADMIN_GET_DETAIL_USER_QUEUE(61, "authentication_get_detail_user_queue"),
        ADMIN_UPDATE_USER_QUEUE(62, "authentication_update_user_queue"),
        ADMIN_DELETE_USER_QUEUE(63, "authentication_delete_user_queue"),
        ADMIN_UNBAN_USER_QUEUE(64, "authentication_admin_un_ban_user_queue"),

        //Admin queue for transaction
        ADMIN_GET_ALL_TRANSACTION_QUEUE(64, "authentication_get_all_transaction_queue"),
        ADMIN_GET_DETAIL_TRANSACTION_QUEUE(65, "authentication_get_detail_transaction_queue"),

        //Admin queue for account type
        ADMIN_GET_ALL_ACCOUNT_TYPE_QUEUE(66, "authentication_get_all_account_type_queue"),
        ADMIN_ADD_ACCOUNT_TYPE_QUEUE(67, "authentication_add_account_type_queue"),
        ADMIN_UPDATE_ACCOUNT_TYPE_QUEUE(68, "authentication_update_account_type_queue"),
        ADMIN_DELETE_ACCOUNT_TYPE_QUEUE(69, "authentication_delete_account_type_queue"),

        //Admin queue for transaction type
        ADMIN_GET_ALL_TRANSACTION_TYPE_QUEUE(70, "authentication_get_all_transaction_type_queue"),
        ADMIN_ADD_TRANSACTION_TYPE_QUEUE(71, "authentication_add_transaction_type_queue"),
        ADMIN_UPDATE_TRANSACTION_TYPE_QUEUE(72, "authentication_update_transaction_type_queue"),
        ADMIN_DELETE_TRANSACTION_TYPE_QUEUE(73, "authentication_delete_transaction_type_queue"),

        //User queue for user type
        USER_UPDATE_PAYEE(75, "authentication_get_update_payee_queue"),

        ADMIN_GET_NEWS_QUEUE(76, "authentication_admin_get_news_queue"),
        APPROVE_NEWS_QUEUE(76, "authentication_approve_news_queue"),
        POST_NEWS_QUEUE(77, "authentication_post_news_queue"),

        //User metadata queue
        GET_USER_CONFIG(78, "authentication_user_get_user_config"),
        UPDATE_USER_CONFIG(79, "authentication_user_update_user_config"),
        GET_USER_NOTIFICATION_CONFIG(80, "authentication_get_user_notification_config"),
        UPDATE_USER_NOTIFICATION_CONFIG(82, "authentication_update_user_notification_config"),
        CREATE_USER_NOTIFICATION_CONFIG(83, "authentication_create_user_notification_config"),
        GET_USER_SECURITY_CONFIG(84, "authentication_get_user_security_config"),
        UPDATE_USER_SECURITY_CONFIG(85, "authentication_update_user_security_config"),
        CREATE_USER_SECURITY_CONFIG(86, "authentication_create_user_security_config"),
        //Notification queue
        PUSH_NOTIFICATION_QUEUE(90, "authentication_push_notification_queue"),
        TRANSACTION_RESPONSE_QUEUE(91, "authentication_transaction_response_queue"),
        //upload File Queue
        USER_UPLOAD_FILE(92, "authentication_upload_new_File"),
        ADMIN_UPLOAD_FILE(93, "authentication_admin_upload_File"),
        CREATE_NEW_CARD(94, "authentication_card_create_new_one");

        Integer code;
        String value;

        Authentication_Queue(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

    }

    public enum CenterService_Queue  {
        GET_TOP_UP_DATA(0, "center_get_top_up_data"),
        GET_SYSTEM_CONFIG(1, "get_system_config_queue"),
        UPDATE_SYSTEM_CONFIG(2, "update_system_config_queue"),
        PRINT_REGISTER_REPORT(3, "center_print_register_report");

        Integer code;
        String value;

        CenterService_Queue(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

    }


    public enum Notification_Queue  {
        PUSH_NOTIFICATION_QUEUE(0, "push_notification_queue"),
        SEND_EMAIL_QUEUE(1, "send_email_queue"),
        SEND_SMS_QUEUE(2, "send_sms_queue"),
        PUSH_TO_SOCKET_QUEUE(4, "send_to_socket_queue"),
        SEND_VERIFY_CODE_EMAIL_QUEUE(5, "send_verify_code_email_queue"),
        SEND_VERIFY_CODE_SMS_QUEUE(6, "send_verify_code_sms_queue");

        Integer code;
        String value;

        Notification_Queue(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

    }

    public enum UserService_Queue {
        GET_USER_PROFILE_QUEUE(0, "get_user_profile_queue"),
        GET_COREBANK_CUSTOMERINFO_QUEUE(1, "get_core_customer_info_queue"),
        GET_USER_PAYEE_QUEUE(3, "get_user_payee_queue"),
        GET_DEVICE_LIST_QUEUE(4, "get_device_list_queue"),
        INSERT_UPDATE_DEVICE_USER_QUEUE(5, "insert_device_user_queue"),
        GET_DEVICES_LIST_BY_CIF_QUEUE(6, "get_device_list_by_cif_queue"),
        ADD_USER_PROFILE_QUEUE(7, "add_to_user_profile_queue"),
        UPDATE_USER_PROFILE_QUEUE(8, "update_user_profile_queue"),
        UPDATE_USER_PROFILE_OTP_QUEUE(9, "update_user_profile_otp_queue"),
        GET_FACEBOOK_INFO(10, "get_facebook_info_queue"),
        LINK_TO_FACEBOOK(32, "user_link_to_facebook_queue"),
        SHARE_TO_FACEBOOK(11, "share_to_facebook_queue"),
        UPDATE_USER_PROFILE_APPROVE_QUEUE(12, "update_user_profile_approve_queue"),
        GET_INTERNAL_INFO(13, "user_get_internal_information"),
        UPDATE_USER_PROFILE_BY_ADMIN(14, "update_user_profile_by_authen"),
        GET_INTERNAL_INFO_AFTER_ACCOUNT(15, "user_get_internal_information_after_account_service"),
        GET_USER_CONFIG(16, "user_get_user_config"),
        UPDATE_USER_CONFIG(17, "user_update_user_config"),
        GET_SPECIFIED_USER_INFO_QUICK_REGISTER(18, "get_user_info_to_approve"),
        SAVE_OR_UPDATE_USER(19, "save_or_update_user_info_queue"),
        REGISTER_PROMISE_USER(20, "register_promise_user"),
        CHECK_LICENSE(21, "check_license_user"),
        GET_BANKTEK_INFO_FROM_ACCOUNT_QUEUE(22, "user_get_banktek_account_name"),
        ADMIN_GET_ALL_USER_QUEUE(23, "admin_get_all_user_queue"),
        ADMIN_GET_DETAIL_USER_QUEUE(24, "admin_get_detail_user_queue"),
        ADMIN_UPDATE_USER_QUEUE(25, "admin_update_user_queue"),
        ADMIN_DELETE_USER_QUEUE(26, "admin_delete_user_queue"),
        UPDATE_USER_PAYEE_QUEUE(27, "user_update_payee_queue"),
        PUSH_NOTIFICATION_QUEUE(28, "userService_push_notification_queue"),
        SEND_EMAIL_QUEUE(29, "userService_send_email_queue"),
        SEND_SMS_QUEUE(30, "userService_send_sms_queue"),
        USER_FORGOT_SOMETHING(31, "userService_user_forgot_something"),
        CREATE_GOAL_SAVE(32, "userService_create_goal_save"),
        INVITE_FIENDS(33, "user_invite_friends"),
        GET_REF_CIF_TO_CLOSE_FD(34, "user_get_ref_cif_to_close_fd");

        Integer code;
        String value;

        UserService_Queue(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

    }

    public enum Socket_Queue {
        SOCKET_WEB_QUEUE(0, "socket_web_queue"),
        DIRECT_SOCKET_WEB_QUEUE(1, "socket_direct_web_queue"),
        TEST_SOCKET_QUEUE(2,"socket_test_socket_queue");

        Integer code;
        String value;

        Socket_Queue(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

    }

    public enum Account_Queue {
        GET_BANK_ACCOUNT_QUEUE(0, "get_account_banktek_queue"),
        GET_LIST_ACCOUNT_QUEUE(1, "get_list_account_queue"),
        UPDATE_BALANCE_CHANGE_QUEUE(2, "update_balance_change_queue"),
        GET_BRANCH_CODE_QUEUE(7, "get_branch_code_queue"),
        GET_ALL_TRANSACTION_OF_ACCOUNT(8, "get_all_transaction_of_account"),
        ADD_NEW_USER_FROM_BANK_SIMU_OR_FRONT(9, "account_add_new_user_from_bank_or_front"),
        GET_INTERNAL_ACCOUNT_INFO_QUEUE(10, "account_get_internal_info_account_queue"),
        UPDATE_REFACCOUNTNUMBER(11, "account_update_ref_account_number"), //this queue only use in system, NOT from front
        UPDATE_CARD_STATUS(12, "update_card_status_queue"),
        TESTAQ(13, "test!just_test_queueA"),
        GET_SPECIFIED_TRANASCTION(14, "account_get_specified_transaction"),
        ADD_BANK_NAME_TO_TRRANSACTION_HISTORY(15, "account_add_bank_name_to_TimeLine"),
        SAVE_OR_UPDATE(16, "save_or_update_user_account_queue"),
        GET_USERNAME_SUGGESTION(17, "account_get_user_name_suggestion"),
        UPDATE_AMOUNT_FROM_SIMULATION(18, "update_amount_from_simulation"),
        ADMIN_GET_ACCOUNT_TYPE_QUEUE(20, "admin_get_account_type_queue"),
        ADMIN_ADD_ACCOUNT_TYPE_QUEUE(21, "admin_add_account_type_queue"),
        ADMIN_UPDATE_ACCOUNT_TYPE_QUEUE(22, "admin_update_account_type_queue"),
        ADMIN_DELETE_ACCOUNT_TYPE_QUEUE(23, "admin_delete_account_type_queue"),
        ADD_CARD_FROM_BANK_SIMULATION(25, "add_account_from_bank_simulation"),
        UPDATE_CARD_STATUS_FROM_BANK_SIMULATION(26, "update_card_status_form_bank_simulation"),
        UPDATE_CARD_AFTER_OTP(27, "update_card_after_otp"),
        CHECK_OTHER_TRANSACTION_TO_BALANCE_CHANGE_QUEUE(28, "check_other_transaction_to_balance_change_queue"),
        CREATE_GOAL_SAVE(29, "create_goal_save"),
        UPDATE_GOAL_SAVE(30, "update_goal_save"),
        GET_FD_ACCOUNT(35,"account_get_fd_account"),
        UPDATE_TERM_DEPOSIT_INFO(36, "update_term_deposit_info"),
        CLOSE_TERM_DEPOSIT(34, "close_term_deposit_queue"),
        UPDATE_TERM_DEPOSIT_STATUS(33, "update_term_deposit_account_status_queue"),
        CREATE_TERM_DEPOSIT(32, "create_term_deposit_account_queue"),
        CREATE_NEW_CARD(33,"account_create_new_card"),
        CREATE_NEW_CARD_AFTER_SIMULATION(34,"account_insert_card_to_service"),
        UPDATE_GOAL_SAVE_STATUS(35, "account_update_goal_save_status"),
        UPDATE_NEXT_GOAL_SAVE(35, "account_update_next_goal_save"),
        WITH_DRAW_TERM_DEPOSIT(37, "account_with_draw_term_deposit"),
        WITH_DRAW_TERM_DEPOSIT_AFTER_OTP(38,"account_withraw_term_deposit_after_otp"),
        GET_ALL_ACCOUNT_INFO(39,"account_get_all_account_info_account_goal_term");

        Integer code;
        String value;

        Account_Queue(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }
    }

    public enum Transaction_Queue {
        CREATE_INTERNAL_TRANSFER_QUEUE(0, "create_internal_transfer_queue"),
        UPDATE_INTERNAL_TRANSFER_QUEUE(1, "update_internal_transfer_queue"),
        GET_PAY_BILL_QUEUE(2, "get_pay_bill_queue"),
        UPDATE_INTERNAL_TRANSFER_QUEUE_AFTER_BANKSIMUlATION(3, "update_internal_transfer_queue_after_banksimulation"),
        RECEIVE_BILL(4, "receive_pay_bill_queue"),
        SUBMIT_BILL(5, "submit_pay_bill_queue"),
        TOPUP_TRANSFER_QUEUE(6, "topup_transfer_queue"),
        GET_SPECIFIED_TRANSACTION(15, "transaction_get_specified_transaction"),
        UPDATE_INTERNAL_TRANSFER_WITH_OTP(16, "transaction_update_internal_transfer_withOTP"),
        RECENT_TOP_UP_PHONE_NUMBER(17, "get_recent_top_up_phone_number"),
        GET_ALL_TRANSACTION_DEFAULT(18, "transaction_get_all_transaction_default"),
        GET_TRANSACTION_FROM_DATE_TO_NOW(19, "transaction_get_transactions_from_date_to_now"),
        GET_TRANSACTION_FROM_DATE_TO_DATE(20, "transaction_get_transactions_from_date_to_date"),
        UPDATE_TRANSACTION_FROM_SIMULATION(21, "update_transaction_from_simulation"),
        GET_BILL_HISTORY(22, "get_bill_history"),
        UPDATE_FD_BALANCE_FROM_SIMULATION(23, "update_fd_balance_from_simulation_queue"),
        WITH_DRAW_FD_ACCOUNT(24, "with_draw_fd_account_queue"),
        ADMIN_GET_ALL_TRANSACTION_QUEUE(27, "admin_get_all_transaction_queue"),
        ADMIN_GET_DETAIL_TRANSACTION_QUEUE(28, "admin_get_detail_transaction_queue"),
        ADMIN_GET_TRANSACTION_TYPE_QUEUE(29, "admin_get_account_type_queue"),
        ADMIN_ADD_TRANSACTION_TYPE_QUEUE(30, "admin_add_account_type_queue"),
        ADMIN_UPDATE_TRANSACTION_TYPE_QUEUE(31, "admin_update_account_type_queue"),
        ADMIN_DELETE_TRANSACTION_TYPE_QUEUE(32, "admin_delete_account_type_queue"),
        ROLLBACK_MOVE_GOAL_SAVE(33, "rollback_move_goal_save"),
        GET_MORE_TRANSACTION_BY_QUANTITY(33,"transaction_get_more_transaction_by_Quantity"),
        UPDATE_TRANSFER_MONEY_GROUP(34,"transaction_update_transferMoney_group_transaction"),
        UPDATE_TRANSFER_MONEY_GROUP_WITH_OTP(35,"transaction_update_transferMoney_group_with_OTP"),
        CHECK_TRANSFER_GROUP_REQUEST(36,"transaction_check_transfer_group_request"),
        GET_FD_ACCOUNT(35,"transaction_get_fd_account");

        Integer code;
        String value;

        Transaction_Queue(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

    }

    public enum Gateway_SimulationBank_Queue {
        INTERNAL_TRANSFER_QUEUE(0, "internal_transfer"),
        GET_USER_INFO_QUEUE(1, "Get_customer_info"),
        GET_ACCOUNT_INFO_QUEUE(2, "Get_account_info"),
        GET_BILL_QUEUE(3, "Get_bill_gateway_queue"),
        SUBMIT_BILL_QUEUE(4, "Submit_bill_gateway_queue"),
        GET_ALL_USER_INFO_QUICK_REGISTER_OTHER_SERVICE(5, "Get_all_users_info_in_other_service"),
        GET_SPECIFIED_USER_INFO_QUICK_REGISTER(6, "get_specified_user_in_quick_register"),
        INSERT_NEW_USER_FROM_DBS_TO_SIMULATION(7, "insert_new_user_from_dbs_to_simulation"),
        GET_CARD_INFO_FROM_SIMULATION(8, "gateway_get_card_info_from_simulation"),
        GET_PROVIDER(9, "get_provider_for_bill"),
        WITH_DRAW_FD_ACCOUNT(10, "with_draw_fd_account"),
        CREATE_GOAL_SAVE(11, "gateway_create_goal_save"),
        WITHDRAW_GOAL_SAVE(12, "gateway_withdraw_goal_save"),
        MOVE_GOAL_SAVE(13, "gateway_move_goal_save"),
        SUGGESTION_USER_INFO_SIMULATION(14, "gateway_suggestion_user_from_simu"),
        GET_LIST_CARD_INFO_SIMULATION(15, "gateway_get_list_card_from_simulation"),
        UPDATE_CARD_STATUS_SIMULATION(16, "update_card_status_simulation"),
        GET_FD_TYPE(17, "gateway_get_fd_type"),
        CREATE_NEW_CARD(18, "gateway_create_new_card");

        Integer code;
        String value;

        Gateway_SimulationBank_Queue(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

    }

    public enum OtherQueue {
        POST_NEWS_QUEUE(0, "post_news_queue"),
        APPROVE_NEWS_QUEUE(1, "approve_news_queue"),
        ADMIN_GET_NEWS_QUEUE(2, "admin_get_news_queue"),
        CHECK_USER_EXITS(3, "other_check_user_exits"),
        ADMIN_GET_APPROVE_USER(4, "admin_get_approve_user");
        Integer code;
        String value;

        OtherQueue(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        public Integer getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

    }

}
