import { NativeModules } from 'react-native';

type EosEccType = {
  multiply(a: number, b: number): Promise<number>;
};

const { EosEcc } = NativeModules;

export default EosEcc as EosEccType;
