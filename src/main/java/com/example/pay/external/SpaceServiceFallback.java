package com.example.pay.external;

public class SpaceServiceFallback implements SpaceService {

    @Override
    public boolean getPermission() {
        return false;
    }
}
