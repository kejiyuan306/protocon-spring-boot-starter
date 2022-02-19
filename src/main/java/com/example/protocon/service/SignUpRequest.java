package com.example.protocon.service;

import java.net.InetSocketAddress;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class SignUpRequest {
    final ClientToken tk;
    final InetSocketAddress addr;
    final short cmdId;
    final long gatewayId;
}
