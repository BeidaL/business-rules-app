package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;

public class Rules2E460E98FBDF296CF50748F35F942A65_PersonValidationServiceRuleMethods0 {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person",
                                                                                               D.entryPoint("persons"));
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .unit(org.acme.travels.PersonValidationService.class)
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PCF.LambdaPredicateCF656804A6B34B948C868CD51C51C3ED.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P36.LambdaExtractor36BD46E9D23B9483643FE0981F1AA9E9.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PDA.LambdaConsequenceDAD8892023421E7D9C86C08C3B107C49.INSTANCE));
        return rule;
    }
}
