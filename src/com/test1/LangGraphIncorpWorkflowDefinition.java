package com.test1;

public class LangGraphIncorpWorkflowDefinition {
	private long workflowDefinitionId;
	private long langGraphConfigurationId;
	private String workflowName;
	private String workflowType;
	private String workflowDescription;
	private String workflowVersion;
	private String entryPointNode;
	private String finishPointNode;
	private long totalNodes;
	private long totalEdges;
	private String conditionalRoutingEnabled;
	private String parallelExecutionEnabled;
	private String subgraphEnabled;
	private String workflowInputSchema;
	private String workflowOutputSchema;
	private String workflowStateSchema;
	private long workflowTimeout;
	private String retryPolicy;

	public LangGraphIncorpWorkflowDefinition() {

	}

	public LangGraphIncorpWorkflowDefinition(long workflowDefinitionId, long langGraphConfigurationId,
			String workflowName, String workflowType, String workflowDescription, String workflowVersion,
			String entryPointNode, String finishPointNode, long totalNodes, long totalEdges,
			String conditionalRoutingEnabled, String parallelExecutionEnabled, String subgraphEnabled,
			String workflowInputSchema, String workflowOutputSchema, String workflowStateSchema, long workflowTimeout,
			String retryPolicy) {
		super();
		this.workflowDefinitionId = workflowDefinitionId;
		this.langGraphConfigurationId = langGraphConfigurationId;
		this.workflowName = workflowName;
		this.workflowType = workflowType;
		this.workflowDescription = workflowDescription;
		this.workflowVersion = workflowVersion;
		this.entryPointNode = entryPointNode;
		this.finishPointNode = finishPointNode;
		this.totalNodes = totalNodes;
		this.totalEdges = totalEdges;
		this.conditionalRoutingEnabled = conditionalRoutingEnabled;
		this.parallelExecutionEnabled = parallelExecutionEnabled;
		this.subgraphEnabled = subgraphEnabled;
		this.workflowInputSchema = workflowInputSchema;
		this.workflowOutputSchema = workflowOutputSchema;
		this.workflowStateSchema = workflowStateSchema;
		this.workflowTimeout = workflowTimeout;
		this.retryPolicy = retryPolicy;
	}

	public long getWorkflowDefinitionId() {
		return workflowDefinitionId;
	}

	public void setWorkflowDefinitionId(long workflowDefinitionId) {
		this.workflowDefinitionId = workflowDefinitionId;
	}

	public long getLangGraphConfigurationId() {
		return langGraphConfigurationId;
	}

	public void setLangGraphConfigurationId(long langGraphConfigurationId) {
		this.langGraphConfigurationId = langGraphConfigurationId;
	}

	public String getWorkflowName() {
		return workflowName;
	}

	public void setWorkflowName(String workflowName) {
		this.workflowName = workflowName;
	}

	public String getWorkflowType() {
		return workflowType;
	}

	public void setWorkflowType(String workflowType) {
		this.workflowType = workflowType;
	}

	public String getWorkflowDescription() {
		return workflowDescription;
	}

	public void setWorkflowDescription(String workflowDescription) {
		this.workflowDescription = workflowDescription;
	}

	public String getWorkflowVersion() {
		return workflowVersion;
	}

	public void setWorkflowVersion(String workflowVersion) {
		this.workflowVersion = workflowVersion;
	}

	public String getEntryPointNode() {
		return entryPointNode;
	}

	public void setEntryPointNode(String entryPointNode) {
		this.entryPointNode = entryPointNode;
	}

	public String getFinishPointNode() {
		return finishPointNode;
	}

	public void setFinishPointNode(String finishPointNode) {
		this.finishPointNode = finishPointNode;
	}

	public long getTotalNodes() {
		return totalNodes;
	}

	public void setTotalNodes(long totalNodes) {
		this.totalNodes = totalNodes;
	}

	public long getTotalEdges() {
		return totalEdges;
	}

	public void setTotalEdges(long totalEdges) {
		this.totalEdges = totalEdges;
	}

	public String getConditionalRoutingEnabled() {
		return conditionalRoutingEnabled;
	}

	public void setConditionalRoutingEnabled(String conditionalRoutingEnabled) {
		this.conditionalRoutingEnabled = conditionalRoutingEnabled;
	}

	public String getParallelExecutionEnabled() {
		return parallelExecutionEnabled;
	}

	public void setParallelExecutionEnabled(String parallelExecutionEnabled) {
		this.parallelExecutionEnabled = parallelExecutionEnabled;
	}

	public String getSubgraphEnabled() {
		return subgraphEnabled;
	}

	public void setSubgraphEnabled(String subgraphEnabled) {
		this.subgraphEnabled = subgraphEnabled;
	}

	public String getWorkflowInputSchema() {
		return workflowInputSchema;
	}

	public void setWorkflowInputSchema(String workflowInputSchema) {
		this.workflowInputSchema = workflowInputSchema;
	}

	public String getWorkflowOutputSchema() {
		return workflowOutputSchema;
	}

	public void setWorkflowOutputSchema(String workflowOutputSchema) {
		this.workflowOutputSchema = workflowOutputSchema;
	}

	public String getWorkflowStateSchema() {
		return workflowStateSchema;
	}

	public void setWorkflowStateSchema(String workflowStateSchema) {
		this.workflowStateSchema = workflowStateSchema;
	}

	public long getWorkflowTimeout() {
		return workflowTimeout;
	}

	public void setWorkflowTimeout(long workflowTimeout) {
		this.workflowTimeout = workflowTimeout;
	}

	public String getRetryPolicy() {
		return retryPolicy;
	}

	public void setRetryPolicy(String retryPolicy) {
		this.retryPolicy = retryPolicy;
	}

}
