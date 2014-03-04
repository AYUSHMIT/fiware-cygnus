package es.tid.fiware.orionconnectors.cosmosinjector.hdfs;

import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Interface for those backends implementing the persistence in HDFS.
 * 
 * @author frb
 */
public interface HDFSBackend {
    
    /**
     * Creates a directory in HDFS.
     * 
     * @param httpClient HTTP client for accessing the backend server.
     * @param dirPath Directory to be created.
     */
    void createDir(DefaultHttpClient httpClient, String dirPath) throws Exception;
    
    /**
     * Creates a file in HDFS with initial content.
     * 
     * @param httpClient HTTP client for accessing the backend server.
     * @param filePath File to be created.
     * @param data Data to be written in the created file.
     */
    void createFile(DefaultHttpClient httpClient, String filePath, String data) throws Exception;
    
    /**
     * Appends data to an existent file in HDFS.
     * 
     * @param httpClient HTTP client for accessing the backend server.
     * @param filePath File where to be append the data.
     * @param data Data to be appended in the file.
     */
    void append(DefaultHttpClient httpClient, String filePath, String data) throws Exception;
    
    /**
     * Checks if the file exists in HDFS.
     * 
     * @param httpClient HTTP client for accessing the backend server.
     * @param filePath File that must be checked.
     */
    boolean exists(DefaultHttpClient httpClient, String filePath) throws Exception;
    
} // HDFSBackend
