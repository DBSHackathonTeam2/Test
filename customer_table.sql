CREATE TABLE `new_db`.`new_table` (
		
		
			 
			 
			`Customer_Id` INT NOT NULL,
		
		
			 
			 
			`UserName` VARCHAR(45) NOT NULL,
		
		
			 
			 
			`Customer_Address` VARCHAR(45) NOT NULL,
		
		
			 
			 
			`Customer_EmailId` VARCHAR(45) NOT NULL,
		
		
			 
			 
			`Customer_Phone` BIGINT NULL,
		
		
			 
			 
			`Customer_PinCode` BIGINT NOT NULL,
		
		
			 
			 
			PRIMARY KEY (`Customer_Id`),
		
		
			 
			 
			UNIQUE INDEX `Customer_Phone_UNIQUE` (`Customer_Phone` ASC) VISIBLE);
