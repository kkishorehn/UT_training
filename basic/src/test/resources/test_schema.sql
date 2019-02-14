DROP TABLE IF EXISTS zvBundleStatus CASCADE;

-- BREAK

DROP TABLE IF EXISTS 				zvBundleStatusMessages CASCADE;

--Break


--       break





CREATE TABLE IF NOT 			EXISTS zvZENObjectEq (
	IDCOL BIGINT NOT NULL
	,RecordID BIGINT NOT NULL
	,SUBTYPE VARCHAR(32)
	);

--      BREAK

ALTER TABLE zvZENObjectEq ADD
CONSTRAINT PK_zvZENObjectEq PRIMARY KEY (IDCOL);

-- BREAK

CREATE TABLE IF NOT EXISTS zvFolder (
   RowLastUpdated timestamp NOT NULL
	,PRIMARYTYPE
	VARCHAR(32)
	NOT

	NULL
	,SUBTYPE VARCHAR(32)
	,TOBEDELETED NUMERIC(1, 0)
	);



-- BREAK




CREATE TABLE IF NOT EXISTS zvBundleStatus (
	RowLastUpdated timestamp NOT NULL
	,ASSIGNMENT_STATUS CHAR(1) DEFAULT 'E'
	,ISASSIGNED NUMERIC(1, 0) DEFAULT 0
	,VBSID BINARY(32) NOT NULL
	) PARTITION BY RowLastUpdated::DATE
GROUP BY CALENDAR_HIERARCHY_DAY(RowLastUpdated::DATE, 2, 2);




-- BREAK