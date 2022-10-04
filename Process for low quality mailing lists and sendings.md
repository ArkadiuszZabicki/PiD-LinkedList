### ==NB: INTERNAL USE CLASSIFICATION!==
==This document is ONLY for internal usage and CANNOT be shared (verbally or in writing) with external parties such as customers – neither in full nor partly.==

---

# Policy for low quality mailing lists and sendings.

- **Version:** 1.0 
- **Date:** 2022-10-04 
- **Policy Owner:** CTO, SOC Manager 
- **Reviewed by:** Jesper Sörtoft, Markus Palokangas, Felix Denbratt, Patrick Lidberg 


### Version history
| Version     | Editor          | Description   | Date       |
|-------------|-----------------|---------------|------------|
| V.1.0.0     | Arkadiusz Zabicki, SOC team lead | First version | 2022-08-01 |
|             |                 |               |            |

---

## Introduction
This document defines a process for customers with low quality mailing lists/sendings: how customers are identified and how the communication and escalation process looks like when actions are needed to ensure bad sendings will stop. 

### Scope
This policy applies to Delivery team members who owns the process of identifying customers with low quality lists/sendigns and the communication process.

### Goals
Establish a clear communication and escalation process that can be easily followed by any delivery team member to ensure harmful sendings will get stopped. 

### Definitions
#### Bad sending
Sending is labeled as bad if it has high bounce rate (usually 10% bounces) or it is sent to bad domains that should have very few or no real subscribers. All sendings labeled as 'bad' are a result of the investigation of our delivery team.



## Policy

Whenever delivery team will discover bad sending, they will open a communication between APSIS and customer to help customer correct abusive behavior. For that reason an incident in Submariner will be created by delivery team and email to the customer will be sent with the reason why the communication was initiated and what needs to be done in order to mitigate the issue.  We've divided bad sendings into 3 categories. For each of them initial communication will be different.

#### Sendings to old and outdated mailing lists 

This results in bounces which can lead to temporary blacklisting, but it's also an indication of subscibers without valid opt in which leads to spam complaints or permanent blacklisting in case they have been turned into spamtraps - even though they might at one point have been opt in. This is a fairly common problem with new Apsis One-customers, they rarely have any understanding of or training in email hygiene and the dangers of importing outdated lists.

Communication draft: https://efficy.sharepoint.com/sites/ApsisRnD/_layouts/15/doc.aspx?sourcedoc={59b93136-26dc-4340-ae9f-49470d661214}&action=edit

#### Sendings to mailing lists that contains spambot signups 

This is possibly less of a problem in Apsis One since many/most are using signup forms with decent bot protection, but it does happen and when it does it's likely that there are spamtraps among the fake subscribers.

Communication draft: https://efficy.sharepoint.com/sites/ApsisRnD/_layouts/15/doc.aspx?sourcedoc={a19af29c-e4cb-4d20-b0fc-b3e8b8974070}&action=edit

#### Sendings with technical issues, such as DMARC with p=reject and no DKIM-signing with Apsis

This happens often, but it's the customers own fault (for implementing DMARC without understanding how it works or monitoring it) and it generally only affects the customers specific sending - not reputation.

In this scenario delivery team/soc will inform Account Manager about the need for DKIM - standard DKIM order will have to be sent to delivery team via Submariner.

### 2nd level of escalation 

In case customer contacted in regard of bad sending won't act accordingly for our initial communication, case will be escalated to Account Manager - Account Manager shall reach to the customer in order to correct abusive behavior. For that reason Submariner ticket will be reassigned to Account Manager with a reason why it's getting escalated (provided by delivery team). If needed, Account Manager order List Hygiene session with PS (if situation was caused by APSIS, either in result of insuficient onboarding, errors in migration, others - customer should not be charged for that).

### 3rd level of escalation

In case customer won't correct their behavior after 1st and 2nd escalation, all sendings from customer's account shall be disabled - at the moment we don't have a way to enforce that in APSIS One