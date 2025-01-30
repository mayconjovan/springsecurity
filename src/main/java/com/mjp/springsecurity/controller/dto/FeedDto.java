package com.mjp.springsecurity.controller.dto;

import java.util.List;

public record FeedDto(List<FeedItemDto> feedItems,
                      int page,
                      int size,
                      int totalPages,
                      long totalElements) {
}
