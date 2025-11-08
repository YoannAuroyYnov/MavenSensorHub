# REFLEXION.md - Refactorisation Architecturale

## Dépendances supprimées/réduites
- **Élimination dépendances croisées** : Modules dépendent d'interfaces (API) au lieu d'implémentations
- **Centralisation versions** : Maven Enforcer + dependencyManagement dans POM parent
- **Migration Java 17→21** : Enforcement strict des versions et détection conflits

## Nouveaux modules ajoutés et leurs rôles
- **sensor-shared** : Modèles communs (SensorData, SensorType, ReportType, UserAction)
- **sensor-api** : Interfaces publiques (ISensor, IDataManager, IReportGenerator, IUserInterface)  
- **sensor-spi** : Classes abstraites pour extensibilité (AbstractSensor, AbstractReportGenerator)
- **sensor-core** : Logique métier (DataManager, capteurs concrets)
- **sensor-persistence** : Accès données (DataStorage, DataCollector)
- **sensor-report-impl** : Générateurs rapports (Text, CSV)
- **sensor-web** : Point d'entrée application (Main, Application)

## Principes respectés
- **Séparation préoccupations** : Modularisation par domaine, cohésion forte, couplage faible
- **DIP via SPI** : Dépendance vers abstractions, extensibilité sans modification du core
- **Open/Closed** : Extension via AbstractSensor et AbstractReportGenerator
- **Interface Segregation** : Interfaces spécialisées et contrats minimaux

## Risques résiduels / Suite logique
- **Complexité** : Architecture plus complexe, courbe d'apprentissage SPI
- **Évolutions** : Injection dépendances (Spring), microservices, persistence réelle, observabilité