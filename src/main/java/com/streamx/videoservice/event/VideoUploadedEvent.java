package com.streamx.videoservice.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Event published to Kafka when a video is uploaded to S3.
 * Encoding Service consumes this to start FFmpeg processing.
 * Topic: video.uploaded
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VideoUploadedEvent {
    private String movieId;
    private String videoKey;
    private String bucketName;
    private String originalFileName;
    private long fileSizeBytes;
}