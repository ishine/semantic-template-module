package com.cooler.semantic.model.console;

import com.cooler.semantic.entity.RRuleEntity;
import com.cooler.semantic.model.REntityWordInfo;

import java.util.List;

public class SimilarityCalculationData_LPM {

        /**
         * 1a.句子向量ID
         */
        private Integer sentenceVectorId;

        /**
         * 1b.上下文ID
         */
        private Integer contextId;

        /**
         * 2a.句子向量实体
         */
        private List<REntityWordInfo> svInputREWIs;

        /**
         * 2b.规则匹配上的实体
         */
        private List<RRuleEntity> ruleMatchedRREs;

        /**
         * 2c.规则缺失的实体
         */
        private List<RRuleEntity> ruleLackedRREs;

        /**
         * 3a.算法类型
         */
        private Integer algorithmType;

        /**
         * 3b.算法公式
         */
        private String algorithmFormula;

        /**
         * 4.交集实体的句子向量端数量占比和规则端数量占比（此量根据算法而不同，这是贾卡德算法产生的值，这里放两个值，用字符串合起来，形式如：( entityId - entityName ) : svVolumnRate - ruleVolumnRate）
         */
        private List<String> intersectionEntityVolumnRates;

        /**
         * 5.规则端，交集实体的数量占比和权重占比（此量根据算法而不同，这是贾卡德算法产生的值，这里放两个值，用字符串合起来，形式如：( entityId - entityName ) : svWeightRate - ruleWeightRate）
         */
        private List<String> intersectionEntityWeightRates;

        /**
         * 6.相似度分值以及其细节值(形如：similarityValue -> intersectionVolumeRateOccupancy * intersectionWeightOccupancy
         */
        private String similarityValue;

        //--------------------------------------------------------------------------------------------------------------gets、sets


        public Integer getSentenceVectorId() {
            return sentenceVectorId;
        }

        public void setSentenceVectorId(Integer sentenceVectorId) {
            this.sentenceVectorId = sentenceVectorId;
        }

        public Integer getContextId() {
            return contextId;
        }

        public void setContextId(Integer contextId) {
            this.contextId = contextId;
        }

        public List<REntityWordInfo> getSvInputREWIs() {
            return svInputREWIs;
        }

        public void setSvInputREWIs(List<REntityWordInfo> svInputREWIs) {
            this.svInputREWIs = svInputREWIs;
        }

        public List<RRuleEntity> getRuleMatchedRREs() {
            return ruleMatchedRREs;
        }

        public void setRuleMatchedRREs(List<RRuleEntity> ruleMatchedRREs) {
            this.ruleMatchedRREs = ruleMatchedRREs;
        }

        public List<RRuleEntity> getRuleLackedRREs() {
            return ruleLackedRREs;
        }

        public void setRuleLackedRREs(List<RRuleEntity> ruleLackedRREs) {
            this.ruleLackedRREs = ruleLackedRREs;
        }

        public Integer getAlgorithmType() {
                    return algorithmType;
                }

        public void setAlgorithmType(Integer algorithmType) {
            this.algorithmType = algorithmType;
        }

        public String getAlgorithmFormula() {
            return algorithmFormula;
        }

        public void setAlgorithmFormula(String algorithmFormula) {
            this.algorithmFormula = algorithmFormula;
        }

        public List<String> getIntersectionEntityVolumnRates() {
            return intersectionEntityVolumnRates;
        }

        public void setIntersectionEntityVolumnRates(List<String> intersectionEntityVolumnRates) {
            this.intersectionEntityVolumnRates = intersectionEntityVolumnRates;
        }

        public List<String> getIntersectionEntityWeightRates() {
            return intersectionEntityWeightRates;
        }

        public void setIntersectionEntityWeightRates(List<String> intersectionEntityWeightRates) {
            this.intersectionEntityWeightRates = intersectionEntityWeightRates;
        }

        public String getSimilarityValue() {
                return similarityValue;
            }

        public void setSimilarityValue(String similarityValue) {
            this.similarityValue = similarityValue;
        }
}