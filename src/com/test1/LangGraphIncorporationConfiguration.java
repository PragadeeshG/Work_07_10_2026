package com.test1;

public class LangGraphIncorporationConfiguration {
	private long langGraphConfigurationId;
	private long applicationId;
	private String applicationName;
	private String graphName;
	private String graphDescription;
	private String graphVersion;
	private String orchestrationType;
	private String llmProvider;
	private String llmModel;
	private String graphExecutionMode;
	private String stateSchema;
	private String checkpointingEnabled;
	private String persistenceType;
	private String memoryEnabled;
	private String streamingEnabled;
	private String humanInLoopEnabled;
	private long maximumExecutionSteps;
	private long executionTimeout;

	public LangGraphIncorporationConfiguration() {

	}

	public LangGraphIncorporationConfiguration(long langGraphConfigurationId, long applicationId,
			String applicationName, String graphName, String graphDescription, String graphVersion,
			String orchestrationType, String llmProvider, String llmModel, String graphExecutionMode,
			String stateSchema, String checkpointingEnabled, String persistenceType, String memoryEnabled,
			String streamingEnabled, String humanInLoopEnabled, long maximumExecutionSteps, long executionTimeout) {
		super();
		this.langGraphConfigurationId = langGraphConfigurationId;
		this.applicationId = applicationId;
		this.applicationName = applicationName;
		this.graphName = graphName;
		this.graphDescription = graphDescription;
		this.graphVersion = graphVersion;
		this.orchestrationType = orchestrationType;
		this.llmProvider = llmProvider;
		this.llmModel = llmModel;
		this.graphExecutionMode = graphExecutionMode;
		this.stateSchema = stateSchema;
		this.checkpointingEnabled = checkpointingEnabled;
		this.persistenceType = persistenceType;
		this.memoryEnabled = memoryEnabled;
		this.streamingEnabled = streamingEnabled;
		this.humanInLoopEnabled = humanInLoopEnabled;
		this.maximumExecutionSteps = maximumExecutionSteps;
		this.executionTimeout = executionTimeout;
	}

	public long getLangGraphConfigurationId() {
		return langGraphConfigurationId;
	}

	public void setLangGraphConfigurationId(long langGraphConfigurationId) {
		this.langGraphConfigurationId = langGraphConfigurationId;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getGraphName() {
		return graphName;
	}

	public void setGraphName(String graphName) {
		this.graphName = graphName;
	}

	public String getGraphDescription() {
		return graphDescription;
	}

	public void setGraphDescription(String graphDescription) {
		this.graphDescription = graphDescription;
	}

	public String getGraphVersion() {
		return graphVersion;
	}

	public void setGraphVersion(String graphVersion) {
		this.graphVersion = graphVersion;
	}

	public String getOrchestrationType() {
		return orchestrationType;
	}

	public void setOrchestrationType(String orchestrationType) {
		this.orchestrationType = orchestrationType;
	}

	public String getLlmProvider() {
		return llmProvider;
	}

	public void setLlmProvider(String llmProvider) {
		this.llmProvider = llmProvider;
	}

	public String getLlmModel() {
		return llmModel;
	}

	public void setLlmModel(String llmModel) {
		this.llmModel = llmModel;
	}

	public String getGraphExecutionMode() {
		return graphExecutionMode;
	}

	public void setGraphExecutionMode(String graphExecutionMode) {
		this.graphExecutionMode = graphExecutionMode;
	}

	public String getStateSchema() {
		return stateSchema;
	}

	public void setStateSchema(String stateSchema) {
		this.stateSchema = stateSchema;
	}

	public String getCheckpointingEnabled() {
		return checkpointingEnabled;
	}

	public void setCheckpointingEnabled(String checkpointingEnabled) {
		this.checkpointingEnabled = checkpointingEnabled;
	}

	public String getPersistenceType() {
		return persistenceType;
	}

	public void setPersistenceType(String persistenceType) {
		this.persistenceType = persistenceType;
	}

	public String getMemoryEnabled() {
		return memoryEnabled;
	}

	public void setMemoryEnabled(String memoryEnabled) {
		this.memoryEnabled = memoryEnabled;
	}

	public String getStreamingEnabled() {
		return streamingEnabled;
	}

	public void setStreamingEnabled(String streamingEnabled) {
		this.streamingEnabled = streamingEnabled;
	}

	public String getHumanInLoopEnabled() {
		return humanInLoopEnabled;
	}

	public void setHumanInLoopEnabled(String humanInLoopEnabled) {
		this.humanInLoopEnabled = humanInLoopEnabled;
	}

	public long getMaximumExecutionSteps() {
		return maximumExecutionSteps;
	}

	public void setMaximumExecutionSteps(long maximumExecutionSteps) {
		this.maximumExecutionSteps = maximumExecutionSteps;
	}

	public long getExecutionTimeout() {
		return executionTimeout;
	}

	public void setExecutionTimeout(long executionTimeout) {
		this.executionTimeout = executionTimeout;
	}

}
