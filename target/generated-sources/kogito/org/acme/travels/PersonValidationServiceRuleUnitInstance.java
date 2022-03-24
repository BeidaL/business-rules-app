package org.acme.travels;

public class PersonValidationServiceRuleUnitInstance extends org.drools.ruleunits.impl.KieSessionBasedRuleUnitInstance<org.acme.travels.PersonValidationService> implements org.kie.kogito.rules.RuleUnitInstance<org.acme.travels.PersonValidationService> {

    public PersonValidationServiceRuleUnitInstance(org.kie.kogito.rules.RuleUnit<org.acme.travels.PersonValidationService> unit, org.acme.travels.PersonValidationService value, org.kie.api.runtime.KieSession evaluator) {
        super(unit, value, evaluator);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession evaluator, org.acme.travels.PersonValidationService value) {
        value.getPersons().subscribe(new org.drools.ruleunits.impl.EntryPointDataProcessor(evaluator.getEntryPoint("persons")));
        evaluator.setGlobal("persons", value.getPersons());
    }
}
