package com.github.zcmee.timeline.web.rest.errors;

public class PhoneNumberAlreadyUsedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public PhoneNumberAlreadyUsedException() {
        super(ErrorConstants.LOGIN_ALREADY_USED_TYPE, "Phone number already used!", "userManagement", "phoneNumberexists");
    }
}
